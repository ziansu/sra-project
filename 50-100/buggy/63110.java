@java.lang.Override
public void onPageStarted(android.webkit.WebView view, java.lang.String url, android.graphics.Bitmap favicon) {
    if ((isLoginPage(url)) && (view.canGoForward())) {
        onBackPressed();
        return ;
    }
    showProgressDialog();
    super.onPageStarted(view, url, favicon);
}