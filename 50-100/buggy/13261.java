private boolean isTouchWithinSlopOfOriginalTouch() {
    float dx = (mCurrentViewPosition.x) - (mOriginalTouchPosition.x);
    float dy = (mCurrentViewPosition.y) - (mOriginalTouchPosition.y);
    double distance = java.lang.Math.sqrt(((java.lang.Math.pow(dx, 2)) + (java.lang.Math.pow(dy, 2))));
    android.util.Log.d(io.mattcarroll.hover.window.InWindowDragger.TAG, ((("Drag distance " + distance) + " vs slop allowance ") + (mTapTouchSlop)));
    return distance < (mTapTouchSlop);
}