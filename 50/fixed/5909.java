public com.group5.bookmanager2.Models.Book createBook() {
    com.group5.bookmanager2.Models.Book book = new com.group5.bookmanager2.Models.Book();
    books.add(book);
    saveChanges();
    return book;
}