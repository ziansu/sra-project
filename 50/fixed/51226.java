void setStatusText(java.lang.String text) {
    if ((mStatusTextView) != null) {
        mStatusTextView.setText(text);
        showStatusTextView();
    }
}