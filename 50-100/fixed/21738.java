private void onSecondaryPointerUp(android.view.MotionEvent ev) {
    final int pointerIndex = ((ev.getAction()) & (ACTION_POINTER_INDEX_MASK)) >> (ACTION_POINTER_INDEX_SHIFT);
    final int pointerId = ev.getPointerId(pointerIndex);
    if (pointerId == (mActivePointerId)) {
        final int newPointerIndex = (pointerIndex == 0) ? 1 : 0;
        mDownMotionX = ev.getX(newPointerIndex);
        mActivePointerId = ev.getPointerId(newPointerIndex);
    }
}