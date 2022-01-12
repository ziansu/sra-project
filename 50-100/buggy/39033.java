private com.velocity.models.capture.ChangeTransaction getCaptureTransactionInstance() throws com.velocity.exceptions.VelocityGenericException {
    float sumOfTipAmount = (java.lang.Float.parseFloat(velocityPaymentTransaction.getAmount())) + (java.lang.Float.parseFloat(velocityPaymentTransaction.getTipAmount()));
    java.lang.String sumValue = java.lang.Float.toString(sumOfTipAmount);
    com.android.velocity.ChangeTransaction captureTransaction = new com.android.velocity.ChangeTransaction();
    captureTransaction.getDifferenceData().setType(VelocityEnums.BankcardCapture);
    captureTransaction.getDifferenceData().setAmount(sumValue);
    captureTransaction.getDifferenceData().setTipAmount(velocityPaymentTransaction.getTipAmount());
    return captureTransaction;
}