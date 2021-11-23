@java.lang.Override
protected void onDestroy() {
    mAdView.destroy();
    myBilling.onDestroy();
    super.onDestroy();
}