public void onPageFinished(android.webkit.WebView view, java.lang.String url) {
    mWeb.loadUrl(("javascript:(function() { " + ("document.getElementsByClassName(\'summary\').item(0).innerHTML=\'<a href=\\\'#\\\' onclick=\\\'translate()\\\' >Translate</a><br/><br/>\';" + "})()")));
    if (mProgress.isShowing()) {
        mProgress.dismiss();
    }
}