public boolean handlePaymentData(int requestCode, int resultCode, @android.support.annotation.NonNull
android.content.Intent data) {
    if (resultCode == (android.app.Activity.RESULT_CANCELED)) {
        fetchCustomer();
        return false;
    }else
        if (resultCode == (android.app.Activity.RESULT_OK)) {
            switch (requestCode) {
                case com.stripe.android.PaymentSession.PAYMENT_METHOD_REQUEST :
                    fetchCustomer();
                    return true;
                case com.stripe.android.PaymentSession.PAYMENT_SHIPPING_DETAILS_REQUEST :
                    com.stripe.android.PaymentSessionData paymentSessionData = data.getParcelableExtra(com.stripe.android.PaymentSession.PAYMENT_SESSION_DATA_KEY);
                    mPaymentSessionData = paymentSessionData;
                    mPaymentSessionListener.onPaymentSessionDataChanged(paymentSessionData);
                    updateIsPaymentReadyToCharge(mPaymentSessionConfig, paymentSessionData);
                    return true;
                default :
                    break;
            }
        }
    
    return false;
}