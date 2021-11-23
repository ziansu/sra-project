@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    com.google.zxing.integration.android.IntentResult scanResult = com.google.zxing.integration.android.IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
    if (scanResult != null) {
        java.lang.String scanText = scanResult.getContents();
        editTextEan.setText(scanText);
    }
    super.onActivityResult(requestCode, resultCode, data);
}