public ClientPortal.TransactionDetailsPage clickTransaction(java.lang.String customer) {
    ClientPortal.Actions.click(common.ClientPortalBrowser.Instance(), ClientPortal.TransactionManagerPage.targetTransactionCustomerClickPath(customer));
    return new ClientPortal.TransactionDetailsPage();
}