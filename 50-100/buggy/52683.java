private com.botscrew.domain.Book getBook(java.lang.String name) {
    java.util.List<com.botscrew.domain.Book> books = ((java.util.List<com.botscrew.domain.Book>) (bookService.findBooks(name)));
    com.botscrew.domain.Book book = null;
    if ((books.size()) == 0) {
        java.lang.System.out.println("We have not book with such name. ");
    }else
        if ((books.size()) > 1) {
            book = selectOneBook(books);
            java.lang.System.out.println(book);
        }else {
            book = books.get(0);
        }
    
    return book;
}