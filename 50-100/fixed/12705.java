@org.junit.Test
public void testGetTrasactionId() throws java.lang.Exception {
    org.p2p.lending.club.api.transaction.impl.Transaction transaction = new org.p2p.lending.club.api.transaction.impl.Transaction("12345");
    org.junit.Assert.assertTrue(((transaction.getTrasactionId()) >= 1));
    transaction = new org.p2p.lending.club.api.transaction.impl.Transaction("12345");
    org.junit.Assert.assertTrue(((transaction.getTrasactionId()) >= 2));
    transaction = new org.p2p.lending.club.api.transaction.impl.Transaction("12345");
    org.junit.Assert.assertTrue(((transaction.getTrasactionId()) >= 3));
}