private void onUp() {
    if (mIsInLongPressMode) {
        revertLongPressAnimation();
        mListener.onLongClickRelease();
    }
    mGestureTarget = null;
}