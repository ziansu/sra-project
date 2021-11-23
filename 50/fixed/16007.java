protected void closeProgress() {
    if (((mProgress) != null) && (mProgress.isShowing())) {
        mProgress.dismiss();
        setRequestedOrientation(oldOrientation);
    }else {
        mProgress = null;
    }
}