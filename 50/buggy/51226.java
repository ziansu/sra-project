void setStatusText(int stringId) {
    if ((mStatusTextView) != null) {
        mStatusTextView.setText(stringId);
        showStatusTextView();
    }
}