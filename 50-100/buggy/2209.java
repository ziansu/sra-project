public void onProgressChanged(android.webkit.WebView view, int progress) {
    java.lang.String url = mWebView.getUrl();
    progressBar.setProgress(progress);
    setNavArrows();
    if ((url != null) && (url.contains("moodle.huebsch.ka.schule-bw.de"))) {
        mWebView.loadUrl(("javascript:(function() { " + (("var head = document.getElementsByClassName('navbar navbar-fixed-top moodle-has-zindex')[0];" + "head.parentNode.removeChild(head);") + "})()")));
    }
    progressBar.setVisibility((progress == 100 ? android.view.View.GONE : android.view.View.VISIBLE));
}