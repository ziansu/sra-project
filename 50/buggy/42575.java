@java.lang.Override
protected void onCancelled(android.graphics.Bitmap bitmap) {
    super.onCancelled(bitmap);
    synchronized(mPauseWorkLock) {
        mPauseWorkLock.notifyAll();
    }
}