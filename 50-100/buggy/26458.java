@org.junit.Test
public void testGetLoanByBook() {
    library.interfaces.entities.ILoan loan = mock(library.interfaces.entities.ILoan.class);
    library.interfaces.entities.IBook book = mock(library.interfaces.entities.IBook.class);
    when(loan.getBook()).thenReturn(book);
    this.loanDAO.commitLoan(loan);
    int loanID = loan.getID();
    verify(loan).commit(loanID);
    library.interfaces.entities.ILoan actualLoan = this.loanDAO.getLoanByBook(book);
    verify(loan).getBook();
    assertEquals(loan, actualLoan);
}