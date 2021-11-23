@org.junit.Test
public void testTransactions() throws java.lang.Exception {
    com.buttercoin.api.Transactions transactions = buttercoin.getTransactions(Transaction.Status.Funded).get();
    org.fest.assertions.Assertions.assertThat(transactions.getTransactions().size()).isGreaterThan(2);
}