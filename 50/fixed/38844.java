public void updateFacePosition(float cx, float cy) {
    mPreviousPosition.set(mCurrentPosition.x, mCurrentPosition.y);
    if (cx != (java.lang.Float.MIN_VALUE)) {
        mCurrentPosition.set(cx, cy);
    }
}