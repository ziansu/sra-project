public void createAccount() {
    try {
        startConversation();
        transactionFailure = null;
        currentAcct = cashierFacade.createAccount(newAccountHolderFirstName, newAccountHolderLastName, newAccountBalance);
    } catch (java.lang.Exception e) {
        handleException(e);
    }
}