private void loadDefaultData() {
    presentation.gui.CreditCard paymentInfo = CheckoutData.INSTANCE.getDefaultPaymentInfo();
    nameOnCardField.setText(paymentInfo.getNameOnCard());
    cardNumberField.setText(paymentInfo.getCardNum());
    cardTypeField.setValue(paymentInfo.getCardType());
    expirationField.setText(paymentInfo.getExpirationDate());
}