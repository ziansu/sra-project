@org.junit.Test
public void addChildToParent() {
    long transactionId = 293;
    transactionService.addTransaction(TRANSACTION_ID, transaction);
    skroll.n26test.model.Transaction child = buildTransaction(transactionId, "car", 23.5);
    child.setParentId(TRANSACTION_ID);
    transactionService.addTransaction(transactionId, child);
    skroll.n26test.model.Transaction parent = skroll.n26test.TransactionService.getTransaction(TRANSACTION_ID);
    assertTrue(parent.getChildren().contains(transactionId));
}