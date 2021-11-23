public void showMessage(int messageResId) {
    mProgressBar.setVisibility(View.GONE);
    mViewFlipper.setDisplayedChild(1);
    mMessagesTextView.setText(messageResId);
    mErrorMessageTextView.setVisibility(View.INVISIBLE);
}