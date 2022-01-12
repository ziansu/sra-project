@java.lang.Override
public boolean shouldOverrideUrlLoading(android.webkit.WebView view, java.lang.String url) {
    if (((url.startsWith("oob")) || (url.startsWith("404"))) || (url.startsWith("ood"))) {
        showCorrectAlertWithUrl(url);
        mAddressBar.setText(url.substring(url.indexOf(":")));
    }else {
        mAddressBar.setText(url);
    }
    return super.shouldOverrideUrlLoading(view, url);
}