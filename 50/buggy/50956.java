@org.junit.Test
public void addNewType() {
    transactionService.addTransaction(TRANSACTION_ID, transaction);
    assertTrue(skroll.n26test.TransactionService.getIdsForType(TYPE).contains(TRANSACTION_ID));
}