@java.lang.Override
protected void onResume() {
    super.onResume();
    android.support.v4.content.LocalBroadcastManager.getInstance(this).registerReceiver(mBroadcastReceiver, new android.content.IntentFilter(com.stripe.android.view.PaymentFlowActivity.EVENT_SHIPPING_INFO_PROCESSED));
}