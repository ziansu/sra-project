public boolean onConsoleMessage(net.gree.unitywebview.ConsoleMessage cm) {
    if ((cm.message()) != null) {
        android.util.Log.d("Webview", cm.message());
    }
    return true;
}