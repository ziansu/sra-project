@java.lang.Override
public void handleResult(com.google.zxing.Result result) {
    java.lang.String resultCode = result.getText();
    android.widget.Toast.makeText(this, ("ScanQRActivity:" + resultCode), Toast.LENGTH_SHORT).show();
    scannerView.stopCamera();
    android.content.Intent intent = new android.content.Intent(this, com.cashlessnfc.application.main.topmenubar.AdminFragmentActivity.class);
    intent.putExtra("go_to", 2);
    startActivity(intent);
    finish();
}