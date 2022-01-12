@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    ca.davidvuong.atise.IntentResult result = ca.davidvuong.atise.IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
    if (result != null) {
        java.lang.String scanContent = result.getContents();
        barcodeHandler(scanContent);
    }
}