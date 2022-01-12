@java.lang.Override
public void onClick(final android.view.View view) {
    android.content.Intent intent = new android.content.Intent(getApplication().getApplicationContext(), vision.BarcodeCaptureActivity.class);
    intent.putExtra(BarcodeCaptureActivity.AutoFocus, true);
    intent.putExtra(BarcodeCaptureActivity.UseFlash, true);
    startActivityForResult(intent, na.nbii.tillapp.MainActivity.RC_BARCODE_CAPTURE);
}