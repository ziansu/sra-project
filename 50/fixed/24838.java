public void withdraw() {
    try {
        transactionFailure = null;
        cashierFacade.withdraw(currentAcct.getAcctNo(), transactionAmount);
        readAcctData();
    } catch (java.lang.Exception e) {
        handleException(e);
    }
}