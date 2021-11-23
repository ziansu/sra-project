public void setViewAlpha() {
    if ((mSyncView) != null) {
        mSyncView.setAlpha(alphaValue);
    }
    if ((toolbar) != null) {
        toolbar.setAlpha((1 - (alphaValue)));
    }
}