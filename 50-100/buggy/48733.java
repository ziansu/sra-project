@java.lang.Override
public boolean onInterceptTouchEvent(android.support.v7.widget.RecyclerView rv, android.view.MotionEvent e) {
    if ((e.getActionMasked()) == (android.view.MotionEvent.ACTION_DOWN)) {
        android.view.View child = rv.findChildViewUnder(e.getX(), e.getY());
        int position = rv.getChildAdapterPosition(child);
        android.widget.Toast.makeText(getApplicationContext(), countries.get(position), Toast.LENGTH_SHORT).show();
    }
    return false;
}