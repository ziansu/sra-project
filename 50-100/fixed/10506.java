@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    android.os.StrictMode.ThreadPolicy policy = new android.os.StrictMode.ThreadPolicy.Builder().permitAll().build();
    android.os.StrictMode.setThreadPolicy(policy);
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_scan);
    integrator = new com.google.zxing.integration.android.IntentIntegrator(this);
    integrator.setDesiredBarcodeFormats(IntentIntegrator.ONE_D_CODE_TYPES);
    integrator.setPrompt("Scan a barcode");
    integrator.setBeepEnabled(true);
    integrator.initiateScan();
}