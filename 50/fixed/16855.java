public void showMessage(java.lang.String message) {
    mProgressBar.setVisibility(View.GONE);
    mViewFlipper.setDisplayedChild(1);
    mMessagesTextView.setText(message);
    mErrorMessageTextView.setVisibility(View.INVISIBLE);
}