@org.junit.Test
public void testAddCustomer() {
    try {
        vu.fs.cs.swt.beans.Customer c = new vu.fs.cs.swt.beans.Customer("John", "Doe", "johnny", "awesomePassword");
        long i = vu.fs.cs.swt.systemclasses.System.Customers.add(c);
        vu.fs.cs.swt.beans.Customer equal = vu.fs.cs.swt.systemclasses.System.Customers.find(((int) (i)));
        vu.fs.cs.swt.systemclasses.System.Customers.delete(((int) (i)));
        assertNotNull(equal);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}