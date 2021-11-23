@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent addSourceIntent = com.stripe.android.view.AddSourceActivity.newIntent(this, true, true);
    if (mStartedFromPaymentSession) {
        addSourceIntent.putExtra(com.stripe.android.PaymentSession.EXTRA_PAYMENT_SESSION_ACTIVE, true);
    }
    startActivityForResult(addSourceIntent, com.stripe.android.view.PaymentMethodsActivity.REQUEST_CODE_ADD_CARD);
}