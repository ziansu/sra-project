@java.lang.Override
public void onCreate(android.os.Bundle state) {
    super.onCreate(state);
    mScannerView = new me.dm7.barcodescanner.zxing.ZXingScannerView(this);
    setContentView(mScannerView);
    com.example.chowdi.qremind.utils.QRCodeScanner.scanningCancelled = false;
    com.example.chowdi.qremind.utils.QRCodeScanner.scanningFinished = false;
    com.example.chowdi.qremind.utils.QRCodeScanner.result = "";
}