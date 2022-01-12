@java.lang.Override
public void onPageFinished(android.webkit.WebView view, java.lang.String url) {
    super.onPageFinished(view, url);
    if (view != null) {
        android.util.Log.v(com.browserdemo.aaron.browserdemo.ui.MyAppWebViewClient.TAG, view.getOriginalUrl());
        com.browserdemo.aaron.browserdemo.manager.DataManager.getOurInstance().setBookmark(view.getTitle(), ((view.getOriginalUrl()) + "favicon.ico"), view.getUrl());
    }
}