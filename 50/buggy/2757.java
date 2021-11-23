public com.axelor.apps.account.db.MoveLine getInvoiceCustomerMoveLineByLoop(com.axelor.apps.account.db.Invoice invoice) throws com.axelor.exception.AxelorException {
    if (this.isDebitCustomer(invoice)) {
        return moveLineService.getDebitCustomerMoveLine(invoice);
    }else {
        return moveLineService.getCreditCustomerMoveLine(invoice);
    }
}