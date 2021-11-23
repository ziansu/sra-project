@java.lang.Override
public boolean onInterceptTouchEvent(android.support.v7.widget.RecyclerView recyclerView, android.view.MotionEvent motionEvent) {
    android.view.View child = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
    if ((child != null) && (mGestureDetector.onTouchEvent(motionEvent))) {
        Drawer.closeDrawers();
        onTouchDrawer(recyclerView.getChildAdapterPosition(child));
        return true;
    }
    return false;
}