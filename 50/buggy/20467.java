@java.lang.Override
public void onReceiveValue(java.lang.String s) {
    dialog.cancel();
    webView.setVisibility(View.VISIBLE);
}