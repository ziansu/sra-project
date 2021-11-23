@java.lang.Override
protected void onResume() {
    if ((mAuthorization) != null) {
        enableNfcPayment();
    }
    super.onResume();
}