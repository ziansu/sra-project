public void webViewLoadUrl(@android.support.annotation.NonNull
java.lang.String url) {
    com.ebnbin.ebapplication.fragment.WebViewFragment webViewFragment = ((com.ebnbin.ebapplication.fragment.WebViewFragment) (getFragmentManager().findFragmentByTag(WebViewFragment.TAG)));
    if (webViewFragment == null) {
        webViewFragment = com.ebnbin.ebapplication.fragment.WebViewFragment.newInstance(url);
        com.ebnbin.ebapplication.base.EBActivity ebActivity = getEBActivity();
        if (ebActivity != null) {
            ebActivity.getSupportFragmentManager().beginTransaction().add(android.R.id.content, webViewFragment, WebViewFragment.TAG).addToBackStack(null).commit();
        }
    }
}