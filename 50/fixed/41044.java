@java.lang.Override
protected void onDetachedFromWindow() {
    mRunning = false;
    mBoardMessenger.removeListener(mBMListener);
    if ((mRenderBitmap) != null) {
        mRenderBitmap.recycle();
        mRenderBitmap = null;
    }
    super.onDetachedFromWindow();
}