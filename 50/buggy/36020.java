@java.lang.Override
protected void onResume() {
    if ((mAuthorization) != null) {
        enableNfcPayment(true);
    }
    super.onResume();
}