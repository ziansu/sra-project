public void removeShowContentCallback() {
    if ((mShowContentRunnable) != null) {
        mHandler.removeCallbacks(mShowContentRunnable);
        mShowContentRunnable = null;
    }
    mCallback.onHideContentActionDetected();
}