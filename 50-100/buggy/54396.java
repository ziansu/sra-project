@org.junit.Test
public void testGetCustomer() {
    try {
        vu.fs.cs.swt.beans.Customer customer = new vu.fs.cs.swt.beans.Customer("John", "Doe", "johnny", "awesomePassword");
        java.lang.String accountNumber = customer.getAccountNumber();
        vu.fs.cs.swt.beans.Saving s = new vu.fs.cs.swt.beans.Saving();
        s.setCustomer(customer);
        assertEquals(s.getCustomer().getAccountNumber(), accountNumber);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}