@org.junit.Test
public void testBorrowAvailable() {
    library.entities.Book book = new library.entities.Book("Available", "Available", "Available", 10);
    assertTrue(((book.getState()) == (eBookState_.AVAILABLE)));
    book.borrow(new library.entities.Loan());
    assertTrue(((book.getState()) == (eBookState_.ON_LOAN)));
}