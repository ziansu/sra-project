@java.lang.Override
public boolean shouldOverrideUrlLoading(android.webkit.WebView view, java.lang.String url) {
    if (((url.contains("oob")) || (url.contains("404"))) || (url.contains("ood"))) {
        showCorrectAlertWithUrl(url);
        mAddressBar.setText(url.substring(url.indexOf(":")));
    }else {
        mAddressBar.setText(url);
    }
    return super.shouldOverrideUrlLoading(view, url);
}