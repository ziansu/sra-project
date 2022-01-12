private void saveToSharedPrefs() {
    android.content.Intent output = new android.content.Intent();
    setResult(com.bridgeconn.autographago.ui.activities.RESULT_OK, output);
    finish();
}