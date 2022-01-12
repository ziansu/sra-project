@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    authWebView.initWebView(getActivity(), false);
    if ((getArguments()) != null) {
        final java.lang.String url = getArguments().getString(org.edx.mobile.view.AuthenticatedWebViewFragment.ARG_URL);
        final java.lang.String javascript = getArguments().getString(org.edx.mobile.view.AuthenticatedWebViewFragment.ARG_JAVASCRIPT);
        authWebView.loadUrlWithJavascript(true, url, javascript);
    }
}