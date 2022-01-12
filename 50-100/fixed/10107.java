private void scanBarcode() {
    android.content.Intent intentScan = new android.content.Intent("com.google.zxing.client.android.SCAN");
    intentScan.putExtra("SCAN_MODE", "QR_CODE_MODE");
    intentScan.putExtra("SAVE_HISTORY", false);
    try {
        startActivityForResult(intentScan, com.wagdy.authapp.MainActivity.SCAN_REQUEST);
    } catch (android.content.ActivityNotFoundException error) {
    }
}