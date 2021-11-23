@java.lang.Override
public boolean shouldOverrideUrlLoading(android.webkit.WebView view, java.lang.String url) {
    if ((((view.getVisibility()) == (android.view.View.VISIBLE)) && (mReaderWebView.hasUrlClickListener())) && (org.wordpress.android.ui.reader.views.ReaderWebView.isValidClickedUrl(url))) {
        return mReaderWebView.getUrlClickListener().onUrlClick(url);
    }else {
        return false;
    }
}