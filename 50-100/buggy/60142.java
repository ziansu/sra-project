@org.junit.Test
public void returnBookUnsuccessfull() {
    java.util.ArrayList allBooks = bookSystem.getBookList();
    com.twu.biblioteca.Book book = new com.twu.biblioteca.Book("Test-Driven Development", "Kent Beck", 2003);
    allBooks.add(book);
    org.junit.Assert.assertEquals(bookSystem.returnBook(book), "That is not a valid book to return.");
}