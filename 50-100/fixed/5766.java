public void borrowerHasBorrowedBooks(java.lang.String borrower, java.lang.String isbns) throws de.codecentric.worblehat.acceptancetests.step.business.BookAlreadyBorrowedException {
    java.util.List<java.lang.String> isbnList = getListOfItems(isbns);
    for (java.lang.String isbn : isbnList) {
        de.codecentric.worblehat.acceptancetests.step.business.Book book = de.codecentric.worblehat.acceptancetests.step.business.DemoBookFactory.createDemoBook().withISBN(isbn).build();
        book = bookService.createBook(book.getTitle(), book.getAuthor(), book.getEdition(), isbn, book.getYearOfPublication(), null);
        bookService.borrowBook(book, borrower);
    }
}