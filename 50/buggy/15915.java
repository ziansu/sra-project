private com.twu.biblioteca.Book locateBook(com.twu.biblioteca.Book b) {
    int index = this.books.indexOf(b);
    if (index == (-1))
        return null;
    
    return books.get(index);
}