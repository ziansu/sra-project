@java.lang.Override
public void onCreate(android.os.Bundle state) {
    super.onCreate(state);
    mScannerView = new me.dm7.barcodescanner.zbar.ZBarScannerView(this);
    java.util.List<me.dm7.barcodescanner.zbar.BarcodeFormat> barcodeFormats = new java.util.ArrayList<>();
    barcodeFormats.add(BarcodeFormat.EAN13);
    mScannerView.setFormats(barcodeFormats);
    mScannerView.setAutoFocus(true);
    setContentView(mScannerView);
}