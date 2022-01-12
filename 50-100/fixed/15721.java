@org.junit.Test(expected = java.lang.RuntimeException.class)
public void testBorrowDamaged() {
    library.entities.Loan loan = new library.entities.Loan();
    library.entities.Loan otherLoan = new library.entities.Loan();
    library.entities.Book book = new library.entities.Book("Available", "Available", "Available", 10);
    book.borrow(loan);
    book.returnBook(true);
    book.borrow(otherLoan);
}