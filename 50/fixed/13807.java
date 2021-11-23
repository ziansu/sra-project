void listBooks() {
    for (com.twu.biblioteca.Book book : bookList) {
        mockedIO.output(book.getName());
    }
}