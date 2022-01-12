@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    if ((mSession) == null)
        return ;
    
    mIsSocialSharingSignIn = getActivity().getIntent().getExtras().getBoolean(com.janrain.android.engage.ui.JRWebViewFragment.SOCIAL_SHARING_MODE);
    mProvider = mSession.getCurrentlyAuthenticatingProvider();
    java.lang.String customUa = mProvider.getWebViewOptions().getAsString(JRDictionary.KEY_USER_AGENT);
    if (customUa != null)
        mWebViewSettings.setUserAgentString(customUa);
    
    java.net.URL startUrl = mSession.startUrlForCurrentlyAuthenticatingProvider();
    mWebView.loadUrl(startUrl.toString());
}