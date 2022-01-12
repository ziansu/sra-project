public void setProgressText(java.lang.String text) {
    if (mShowProgressText) {
        getProgressTextView().setText(text);
        getProgressTextView().setTextColor(mNotCompletedReachColor);
    }else {
        getProgressTextView().setVisibility(View.GONE);
    }
}