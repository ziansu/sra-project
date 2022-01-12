private void scannerQrCode(android.app.Activity activity) {
    com.google.zxing.integration.android.IntentIntegrator integrator = new com.google.zxing.integration.android.IntentIntegrator(activity);
    integrator.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE_TYPES);
    integrator.setPrompt("Scan QR");
    integrator.setCameraId(0);
    integrator.setBeepEnabled(false);
    integrator.setBarcodeImageEnabled(false);
    integrator.initiateScan();
}