@java.lang.Override
public void onClick(android.view.View view) {
    if ((view.getId()) == (R.id.scan_button)) {
        starthack.fridgetogo.com.google.zxing.integration.android.IntentIntegrator scanIntegrator = new starthack.fridgetogo.com.google.zxing.integration.android.IntentIntegrator(((android.app.Fragment) (this)));
        scanIntegrator.initiateScan();
    }
}