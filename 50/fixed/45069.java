@java.lang.Override
public address.browser.embeddedbrowser.EbDocument getDomElement() {
    if ((this.webView.getEngine().getDocument()) == null) {
        return null;
    }
    return new address.browser.javabrowser.WebViewDocAdapter(this.webView.getEngine().getDocument());
}