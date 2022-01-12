@java.lang.Override
public void handleResult(com.google.zxing.Result rawResult) {
    android.util.Log.d(br.usp.ime.mac5743.ep1.seminarioime.activity.ReadQRCodeActivity.TAG, rawResult.getText());
    android.util.Log.d(br.usp.ime.mac5743.ep1.seminarioime.activity.ReadQRCodeActivity.TAG, rawResult.getBarcodeFormat().toString());
    saveResult(rawResult.getText());
}