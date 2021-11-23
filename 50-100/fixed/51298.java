@java.lang.Override
public void onActivityResult(final int requestCode, final int resultCode, final android.content.Intent intent) {
    com.nervousfish.nervousfish.activities.QRExchangeKeyActivity.LOGGER.info("Activity resulted");
    final com.google.zxing.integration.android.IntentResult scanResult = com.google.zxing.integration.android.IntentIntegrator.parseActivityResult(requestCode, resultCode, intent);
    if (scanResult == null) {
        com.nervousfish.nervousfish.activities.QRExchangeKeyActivity.LOGGER.error("No scan result in QR Scanner");
    }else {
        final java.lang.String result = scanResult.getContents();
        this.addNewContact(result);
    }
}