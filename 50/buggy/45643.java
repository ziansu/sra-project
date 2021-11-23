@java.lang.Override
public void onWriteError(java.lang.Throwable e) {
    android.widget.Toast.makeText(context, R.string.error_write, Toast.LENGTH_LONG).show();
    android.util.Log.e(NFCDemoApplication.LOG_TAG, "Error occurred while writing NFC card", e);
}