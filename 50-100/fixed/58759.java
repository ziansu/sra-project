@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (resultCode == (RESULT_OK)) {
        if (requestCode == (com.braintreepayments.api.dropin.view.PaymentButton.REQUEST_CODE)) {
            com.braintreepayments.api.dropin.BraintreePaymentActivity.StubbedView.LOADING_VIEW.show(this);
            mAddPaymentMethodViewController.onPaymentResult(requestCode, resultCode, data);
        }
    }else
        if (resultCode == (RESULT_CANCELED)) {
            mBraintree.sendAnalyticsEvent("add-paypal.user-canceled");
        }
    
}