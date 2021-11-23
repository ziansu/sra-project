@org.junit.Test
public void testGetTransaction() throws com.SpryngPayments.Java.Exceptions.RequestException {
    com.SpryngPayments.Java.Models.Transaction transaction = spryng.transaction.get(TRANSACTION_ID);
    assertNotNull(transaction);
}