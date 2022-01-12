private static final ClientPortal.Locator targetTransactionCustomer(ClientPortal.enums.TransactionManagerColumn column, java.lang.String customer) {
    return new ClientPortal.Locator(org.openqa.selenium.By.xpath(((ClientPortal.TransactionManagerPage.transactionPath(customer)) + (ClientPortal.TransactionManagerPage.getTransactionColumnPath(column, customer)))), ((("Transaction Customer: " + customer) + " ") + (column.toString())));
}