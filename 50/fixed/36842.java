public void findAccount() {
    try {
        startConversation();
        transactionFailure = null;
        currentAcct = cashierFacade.findAccount(searchedAcct);
    } catch (java.lang.Exception e) {
        handleException(e);
    }
}