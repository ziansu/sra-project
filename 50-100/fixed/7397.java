private void loadDefaultData() {
    presentation.gui.CreditCard paymentInfo = CheckoutData.INSTANCE.getDefaultPaymentInfo();
    nameOnCardField.setText(paymentInfo.getNameOnCard());
    cardNumberField.setText(paymentInfo.getCardType());
    cardTypeField.setValue(paymentInfo.getCardNum());
    expirationField.setText(paymentInfo.getExpirationDate());
}