public void run() {
    if ((mRootLayout != null) && (mNendAdView != null)) {
        mRootLayout.removeView(mNendAdView);
    }
    callbackContext.success();
}