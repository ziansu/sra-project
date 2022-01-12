@java.lang.Override
public void run() {
    webView.loadUrl((("javascript:loadDraft('" + data) + "')"));
    android.util.Log.d("posting data", data);
}