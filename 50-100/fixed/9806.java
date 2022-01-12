@org.androidannotations.annotations.Click(value = R.id.fragment_bt_scan_qr)
protected void scannerQrCode() {
    com.google.zxing.integration.android.IntentIntegrator integrator = new com.google.zxing.integration.android.IntentIntegrator(getActivity());
    integrator.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE_TYPES);
    integrator.setPrompt("Scan QR");
    integrator.setCameraId(0);
    integrator.setBeepEnabled(false);
    integrator.setBarcodeImageEnabled(false);
    integrator.initiateScan();
}