@java.lang.Override
public boolean onInterceptTouchEvent(android.support.v7.widget.RecyclerView recyclerView, android.view.MotionEvent motionEvent) {
    android.view.View child = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
    if ((child != null) && (mGestureDetector.onTouchEvent(motionEvent))) {
        Drawer.closeDrawers();
        onTouchDrawer(recyclerView.getChildAdapterPosition(child));
        android.widget.Toast.makeText(this, ("The Item Clicked issssss: " + (recyclerView.getChildAdapterPosition(child))), Toast.LENGTH_SHORT).show();
        return true;
    }
    return false;
}