public boolean onConsoleMessage(net.gree.unitywebview.ConsoleMessage cm) {
    android.util.Log.d("Webview", cm.message());
    return true;
}