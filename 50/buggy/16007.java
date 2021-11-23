protected void closeProgress() {
    if (mProgress.isShowing()) {
        mProgress.dismiss();
        setRequestedOrientation(oldOrientation);
    }
}