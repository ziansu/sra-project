@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.util.Log.d(ambious.androidtroper.MainActivity.LOG_TAG, "Creating View...");
    android.view.View v = inflater.inflate(R.layout.tab_fragment, null);
    android.webkit.WebView _webView = ((ambious.androidtroper.MainActivity.MyWebView) (v.findViewById(R.id.web_view)));
    _webView.getSettings().setJavaScriptEnabled(true);
    registerForContextMenu(_webView);
    return v;
}