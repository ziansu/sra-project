@java.lang.Override
protected void onDetachedFromWindow() {
    mRunning = false;
    mHandlerThread.quit();
    mBoardMessenger.removeListener(mBMListener);
    if ((mRenderBitmap) != null) {
        mRenderBitmap.recycle();
    }
    super.onDetachedFromWindow();
}