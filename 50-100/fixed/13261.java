private boolean isTouchWithinSlopOfOriginalTouch(float dx, float dy) {
    double distance = java.lang.Math.sqrt(((java.lang.Math.pow(dx, 2)) + (java.lang.Math.pow(dy, 2))));
    android.util.Log.d(io.mattcarroll.hover.window.InWindowDragger.TAG, ((("Drag distance " + distance) + " vs slop allowance ") + (mTapTouchSlop)));
    return distance < (mTapTouchSlop);
}