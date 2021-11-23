private void updateViewPosition(float x, float y) {
    if ((mFloatLayout) != null) {
        mLayoutParams.y = ((int) (y - (mTouchStartY)));
        mLayoutParams.x = ((int) (x - (mTouchStartX)));
        mWindowManager.updateViewLayout(mFloatLayout, mLayoutParams);
    }
}