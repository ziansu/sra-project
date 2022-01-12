@org.junit.Test
public void testCheckLoanDblStringPass() {
    assertEquals(false, server.logic.tables.LoanTable.getInstance().checkLoan("9781442668584", "1"));
}