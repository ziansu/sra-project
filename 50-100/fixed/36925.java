@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent event) {
    mCommend.onTouchEvent(mDrawableList, event);
    calculateDirtyRegion();
    invalidate(((int) ((dirtyRect.left) - 20)), ((int) ((dirtyRect.top) - 20)), ((int) ((dirtyRect.right) + 20)), ((int) ((dirtyRect.bottom) + 20)));
    return true;
}