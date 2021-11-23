private boolean shouldStartDeferredDrag(int x, int y, boolean containerContainsTouch) {
    int closestEdgeY = (mIsAboveIcon) ? getMeasuredHeight() : 0;
    double distToEdge = java.lang.Math.abs(((mTouchDown.y) - closestEdgeY));
    double newDistToEdge = java.lang.Math.hypot((x - (mTouchDown.x)), (y - closestEdgeY));
    return (!containerContainsTouch) && ((newDistToEdge - distToEdge) > (mStartDragThreshold));
}