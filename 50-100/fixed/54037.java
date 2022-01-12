@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent ev) {
    if ((((ev.getAction()) == (android.view.MotionEvent.ACTION_DOWN)) && (isEnabled())) && ((mDraggableLayout) != null)) {
        mDraggableLayout.preDrawDrag(this, ev);
        mDraggableLayout.setCanIntercept(true);
        return true;
    }
    return false;
}