private void releaseSurfaceTexture() {
    if ((mSurface) != null) {
        boolean shouldRelease = true;
        if ((mListener) != null) {
            shouldRelease = mListener.onSurfaceTextureDestroyed(mSurface);
        }
        synchronized(mNativeWindowLock) {
            nDestroyNativeWindow();
        }
        if (shouldRelease) {
            mSurface.release();
        }
        mSurface = null;
        mHadSurface = true;
    }
}