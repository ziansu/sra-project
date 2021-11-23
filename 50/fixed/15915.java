private com.twu.biblioteca.Book locateBook(com.twu.biblioteca.Book b) {
    int index = this.books.indexOf(b);
    return index >= 0 ? books.get(index) : null;
}