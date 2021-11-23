@java.lang.Override
public void onAttach(android.content.Context context) {
    super.onAttach(context);
    android.util.Log.d(TAG, "onAttach: called from webview fragment");
    webviewFragmentListener = ((camelcase.searchemall.WebViewFragment.WebviewFragmentListener) (context));
}