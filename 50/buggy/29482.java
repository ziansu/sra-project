public void testProcessTransactionObjectSuccess() throws java.lang.Exception {
    mt.edu.um.kurtjeantwan.AtomicTransaction trn = new mt.edu.um.kurtjeantwan.AtomicTransaction(1, 2, 5, accountDb);
    org.junit.Assert.assertFalse(tm1.processTransaction(trn));
}