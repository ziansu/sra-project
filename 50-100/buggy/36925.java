@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent event) {
    switch (mInteractionMode) {
        case com.agsw.FabricView.FabricView.DRAW_MODE :
            mCommend.onTouchEvent(mDrawableList, event);
            calculateDirtyRegion();
            invalidate(((int) ((dirtyRect.left) - 20)), ((int) ((dirtyRect.top) - 20)), ((int) ((dirtyRect.right) + 20)), ((int) ((dirtyRect.bottom) + 20)));
            return true;
        default :
            return false;
    }
}