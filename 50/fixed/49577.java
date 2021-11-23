private void startBarcodeScan() {
    com.google.zxing.integration.android.IntentIntegrator integrator = com.google.zxing.integration.android.IntentIntegrator.forSupportFragment(this);
    integrator.setCaptureActivity(it.jaschke.alexandria.ui.CaptureAnyOrientationActivity.class);
    integrator.setOrientationLocked(false);
    integrator.initiateScan();
}