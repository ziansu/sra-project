@java.lang.Override
public void onResume() {
    super.onResume();
    android.util.Log.d("QR Fragment", "Resuming");
    mScannerView.setResultHandler(this);
    mScannerView.startCamera();
}