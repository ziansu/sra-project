private boolean canChildDragDown() {
    ensureTarget();
    boolean result = android.support.v4.view.ViewCompat.canScrollVertically(mTarget, (-1));
    return result;
}