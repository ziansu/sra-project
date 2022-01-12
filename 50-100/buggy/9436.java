@org.junit.Test(expected = java.lang.RuntimeException.class)
public void testBorrowOnLoan() {
    java.lang.System.out.println("Borrow: Book is ON LOAN test.");
    library.entities.Loan loan = new library.entities.Loan();
    library.entities.Loan otherLoan = new library.entities.Loan();
    library.entities.Book book = new library.entities.Book("Available", "Available", "Available", 10);
    book.borrow(loan);
    book.borrow(otherLoan);
}