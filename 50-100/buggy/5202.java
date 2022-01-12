@java.lang.Override
public boolean onSingleTapConfirmed(android.view.MotionEvent e) {
    final android.view.View childView = rv.findChildViewUnder(e.getX(), e.getY());
    final int position = rv.getChildAdapterPosition(childView);
    onItemClick(childView, position);
    return true;
}