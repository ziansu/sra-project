private void setPlainText(java.lang.CharSequence text) {
    webView.setVisibility(org.stepic.droid.ui.custom.GONE);
    textView.setVisibility(org.stepic.droid.ui.custom.VISIBLE);
    textView.setText(text);
}