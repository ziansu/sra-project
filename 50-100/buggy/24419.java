@java.lang.Override
public void signalResponseAvailable(java.lang.String responseJSON) {
    this.queueResponseJSON.push(responseJSON);
    final android.webkit.WebView webView = ((android.webkit.WebView) (getView().findViewById(org.opendatakit.tables.R.id.webkit)));
    this.getActivity().runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            webView.loadUrl("javascript:datarsp.responseAvailable();");
        }
    });
}