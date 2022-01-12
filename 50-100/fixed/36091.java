@java.lang.Override
public boolean onInterceptTouchEvent(android.support.v7.widget.RecyclerView rv, android.view.MotionEvent e) {
    android.view.View child = rv.findChildViewUnder(e.getX(), e.getY());
    if (((child != null) && ((clicklistener) != null)) && (gestureDetector.onTouchEvent(e))) {
        clicklistener.onClick(child, rv.getChildAdapterPosition(child));
        return true;
    }
    return false;
}