private com.velocity.models.capture.ChangeTransaction getCaptureTransactionInstance() throws com.velocity.exceptions.VelocityGenericException {
    com.android.velocity.ChangeTransaction captureTransaction = new com.android.velocity.ChangeTransaction();
    captureTransaction.getDifferenceData().setType(VelocityEnums.BankcardCapture);
    captureTransaction.getDifferenceData().setAmount(velocityPaymentTransaction.getAmount());
    captureTransaction.getDifferenceData().setTipAmount(velocityPaymentTransaction.getTipAmount());
    return captureTransaction;
}