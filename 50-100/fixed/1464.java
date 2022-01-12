@org.jbehave.core.annotations.Given(value = "a library, containing a book with isbn <isbn>")
public void createLibraryWithSingleBookWithGivenIsbn(@org.jbehave.core.annotations.Named(value = "isbn")
java.lang.String isbn) {
    de.codecentric.worblehat.acceptancetests.step.business.Book book = de.codecentric.worblehat.acceptancetests.step.business.DemoBookFactory.createDemoBook().withISBN(isbn).build();
    bookService.createBook(book.getTitle(), book.getAuthor(), book.getEdition(), isbn, book.getYearOfPublication(), null);
}