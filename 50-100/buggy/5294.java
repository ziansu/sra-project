private static void displayInWebview(final android.app.Activity activity, java.lang.String url) {
    android.app.AlertDialog.Builder alert = new android.app.AlertDialog.Builder(activity);
    android.webkit.WebView wv = new android.webkit.WebView(activity);
    wv.loadUrl(url);
    wv.setWebViewClient(new android.webkit.WebViewClient() {
        @java.lang.Override
        public boolean shouldOverrideUrlLoading(android.webkit.WebView view, java.lang.String url) {
            view.loadUrl(url);
            return true;
        }
    });
    alert.setView(wv);
    alert.setPositiveButton(android.R.string.ok, null);
    alert.show();
}