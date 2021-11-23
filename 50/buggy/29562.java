@org.junit.Test
public void sumWithoutChildren() {
    transactionService.addTransaction(TRANSACTION_ID, transaction);
    assertEquals(AMOUNT, skroll.n26test.TransactionService.calculateSum(TRANSACTION_ID), DELTA);
}