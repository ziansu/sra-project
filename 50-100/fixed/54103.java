@java.lang.Override
public void onCreate(android.os.Bundle state) {
    super.onCreate(state);
    setContentView(R.layout.scanner_activity);
    android.view.ViewGroup contentFrame = ((android.view.ViewGroup) (findViewById(R.id.scan_frame)));
    mScannerView = new me.dm7.barcodescanner.zxing.ZXingScannerView(this) {    };
    back = ((android.widget.Button) (findViewById(R.id.back)));
    back.setOnClickListener(this);
    if (!(isSnack)) {
        back.setAlpha(0.0F);
    }
    contentFrame.addView(mScannerView);
    back.bringToFront();
}