public com.axelor.apps.account.db.MoveLine getInvoiceCustomerMoveLineByQuery(com.axelor.apps.account.db.Invoice invoice) throws com.axelor.exception.AxelorException {
    if (this.isDebitCustomer(invoice, true)) {
        return moveLineRepository.all().filter("self.move = ?1 AND self.account = ?2 AND self.debit > 0 AND self.amountRemaining > 0", invoice.getMove(), invoice.getPartnerAccount()).fetchOne();
    }else {
        return moveLineRepository.all().filter("self.move = ?1 AND self.account = ?2 AND self.credit > 0 AND self.amountRemaining > 0", invoice.getMove(), invoice.getPartnerAccount()).fetchOne();
    }
}