@java.lang.Override
public void run() {
    if ((inAppShellHepler.getWebView()) != null) {
        inAppShellHepler.getWebView().loadUrl(stringBuilder.toString());
    }
}