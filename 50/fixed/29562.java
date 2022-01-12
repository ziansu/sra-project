@org.junit.Test
public void sumWithoutChildren() {
    transactionService.addTransaction(TRANSACTION_ID, transaction);
    assertEquals(AMOUNT, transactionService.calculateSum(TRANSACTION_ID), DELTA);
}