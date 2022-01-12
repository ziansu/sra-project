@java.lang.Override
public void onClick(android.view.View view) {
    if ((qrCodeReaderView) != null) {
        qrCodeReaderView.stopCamera();
    }
    this.finish();
}