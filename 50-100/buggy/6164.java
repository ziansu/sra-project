@java.lang.Override
public boolean onInterceptTouchEvent(android.support.v7.widget.RecyclerView rv, android.view.MotionEvent e) {
    android.view.View childView = rv.findChildViewUnder(e.getX(), e.getY());
    if (((childView != null) && ((mListener) != null)) && (mGestureDetector.onTouchEvent(e))) {
        mListener.onItemClick(childView, rv.getChildAdapterPosition(childView));
        return true;
    }
    return false;
}