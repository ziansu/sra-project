@org.junit.Test
public void addKnownType() {
    transactionService.addTransaction(TRANSACTION_ID, transaction);
    skroll.n26test.model.Transaction secondTransaction = buildTransaction(((TRANSACTION_ID) + 1), TYPE, AMOUNT);
    transactionService.addTransaction(((TRANSACTION_ID) + 1), secondTransaction);
    assertTrue(((transactionService.getIdsForType(TYPE).contains(TRANSACTION_ID)) && (transactionService.getIdsForType(TYPE).contains(((TRANSACTION_ID) + 1)))));
}