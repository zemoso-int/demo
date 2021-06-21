package com.example.library.service;

import com.example.library.entity.Author;
import com.example.library.dto.AuthorDto;

import java.util.List;

public interface AuthorService {
    public Integer addAuthor(Author authorDto);
    public List<Author>  getAllAuthors();
    public Author getAuthorById(Integer id);
}
