@java.lang.Override
public void onProgressChanged(android.webkit.WebView view, int newProgress) {
    super.onProgressChanged(view, newProgress);
    if (newProgress > 0) {
        progressBar.setIndeterminate(false);
        progressBar.setProgress(newProgress);
    }
}