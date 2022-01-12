private void releaseVelocityTracker() {
    if ((mVelocityTracker) != null) {
        mVelocityTracker.recycle();
        mVelocityTracker = null;
    }
}