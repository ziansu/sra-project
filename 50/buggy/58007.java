@java.lang.Override
public void onClick(android.view.View view) {
    if ((qrCodeReaderView) != null) {
        qrCodeReaderView.stopCamera();
    }
    startActivity(new android.content.Intent(this, com.project.greenfuture.petugas.activity.Main2Activity.class));
    this.finish();
}