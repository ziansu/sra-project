public void updateDisplay(com.pj.magic.model.CreditCard creditCard) {
    selectedPayments.clear();
    java.util.List<com.pj.magic.model.PurchasePaymentCreditCardPayment> creditCardPayments = getAllUnpaidCreditCardPaymentsNotIncludedInStatement();
    tableModel.setItems(creditCardPayments);
}