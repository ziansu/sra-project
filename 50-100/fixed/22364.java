@java.lang.Override
public void onLongPress(android.view.MotionEvent e) {
    super.onLongPress(e);
    final android.view.View childView = rv.findChildViewUnder(e.getX(), e.getY());
    if (childView != null) {
        final int position = rv.getChildAdapterPosition(childView);
        onItemLongClick(childView, position);
    }
}