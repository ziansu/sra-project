@org.junit.Test(expected = java.lang.RuntimeException.class)
public void testBorrowDisposed() {
    library.entities.Loan loan = new library.entities.Loan();
    library.entities.Book book = new library.entities.Book("Available", "Available", "Available", 10);
    book.dispose();
    book.borrow(loan);
}