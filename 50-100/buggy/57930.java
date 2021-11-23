@org.junit.Test
public void returnBook() {
    java.util.ArrayList allBooks = bookSystem.getBookList();
    com.twu.biblioteca.Book book = new com.twu.biblioteca.Book("Test-Driven Development", "Kent Beck", 2003);
    bookSystem.returnBook(book);
    org.junit.Assert.assertEquals(bookSystem.getBookByName("Test-Driven Development").isOnLoan(), book.isOnLoan());
}