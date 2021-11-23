protected void setLoginInProgress(boolean inProgress) {
    mLoginButton.setEnabled(inProgress);
    int visibility;
    if (inProgress) {
        visibility = android.view.View.INVISIBLE;
    }else {
        visibility = android.view.View.VISIBLE;
    }
    mProgressBar1.setVisibility(visibility);
    mProgressBar2.setVisibility(visibility);
    mProgressBar3.setVisibility(visibility);
}