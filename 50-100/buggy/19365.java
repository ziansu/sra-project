@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.webkit.WebView myWebView = ((android.webkit.WebView) (inflater.inflate(R.layout.fragment_catalog, container, false)));
    myWebView.setWebViewClient(new android.webkit.WebViewClient());
    myWebView.getSettings().setJavaScriptEnabled(true);
    com.loopbook.cuhk_loopbook.MainActivity.CatalogFragment.currentView = myWebView;
    com.loopbook.cuhk_loopbook.MainActivity.CatalogFragment.login(getActivity());
    return myWebView;
}