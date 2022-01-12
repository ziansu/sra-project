@org.junit.Test
public void sumWithChildren() {
    long transactionId = 293;
    double amount = 23.5;
    double expectedAmount = amount + (AMOUNT);
    transactionService.addTransaction(TRANSACTION_ID, transaction);
    skroll.n26test.model.Transaction child = buildTransaction(transactionId, "car", amount);
    child.setParentId(TRANSACTION_ID);
    transactionService.addTransaction(transactionId, child);
    double sum = transactionService.calculateSum(TRANSACTION_ID);
    assertEquals(expectedAmount, sum, DELTA);
}