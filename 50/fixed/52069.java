@java.lang.Override
public void setNetworkAvailable(boolean value) {
    if ((webView) != null) {
        webView.setNetworkAvailable(value);
    }
}