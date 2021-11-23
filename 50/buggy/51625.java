@java.lang.Override
public void onPageStarted(android.webkit.WebView view, java.lang.String url, android.graphics.Bitmap favicon) {
    super.onPageStarted(view, url, favicon);
    progressBar.setProgress(0);
    progressBar.setIndeterminate(false);
    progressBar.setVisibility(View.VISIBLE);
}