public com.axelor.apps.account.db.Move createMoveUseExcessPaymentOrDue(com.axelor.apps.account.db.Invoice invoice) throws com.axelor.exception.AxelorException {
    com.axelor.apps.account.db.Move move = null;
    if (invoice != null) {
        if (moveToolService.isDebitCustomer(invoice)) {
            this.createMoveUseExcessPayment(invoice);
        }else {
            this.createMoveUseInvoiceDue(invoice);
        }
    }
    return move;
}