private void saveToSharedPrefs() {
    android.content.Intent output = new android.content.Intent();
    output.putExtra(Constants.Keys.RECREATE_NEEDED, com.bridgeconn.autographago.ui.activities.SettingsActivity.recreateNeeded);
    setResult(com.bridgeconn.autographago.ui.activities.RESULT_OK, output);
    finish();
}