@java.lang.Override
public void onCancel() {
    android.util.Log.i("Cancel", "Canceled");
    try {
        android.util.Log.i("Webview Title: ", webview.getTitle());
    } catch (java.lang.Exception e) {
        android.util.Log.i("webview.getTitle(): ", e.toString());
    }
    bringBackWebView();
}