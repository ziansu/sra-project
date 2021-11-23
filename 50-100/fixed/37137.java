@java.lang.Override
@android.annotation.TargetApi(value = Build.VERSION_CODES.LOLLIPOP)
public boolean onClose(final int id, wei.mark.standout.ui.Window window) {
    android.util.Log.d("### destroying", "the streaming window is closing");
    if ((wv) != null) {
        wv.evaluateJavascript("if(window.connection){window.connection.close();}", new android.webkit.ValueCallback<java.lang.String>() {
            @java.lang.Override
            public void onReceiveValue(java.lang.String value) {
                android.util.Log.d("### CLOSING", value);
                wv.loadUrl("about:blank");
                wv = null;
                close(id);
            }
        });
    }
    return false;
}