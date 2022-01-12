@java.lang.Override
public void onActivityResult(final int requestCode, final int resultCode, final android.content.Intent intent) {
    final com.google.zxing.integration.android.IntentResult scanResult = com.google.zxing.integration.android.IntentIntegrator.parseActivityResult(requestCode, resultCode, intent);
    if (scanResult != null) {
        final java.lang.String result = scanResult.getContents();
        addNewContact(result);
    }else {
        com.nervousfish.nervousfish.activities.QRExchangeKeyActivity.LOGGER.error("No scan result in QR Scanner");
    }
}