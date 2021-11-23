@java.lang.Override
public boolean onInterceptTouchEvent(android.view.MotionEvent ev) {
    final int action = ev.getAction();
    if (action == (android.view.MotionEvent.ACTION_DOWN)) {
        return (ev.getX()) < (nesto.gankio.ui.widget.swipe_back.SwipeBackLayout.EDGE_SIZE);
    }
    return super.onInterceptTouchEvent(ev);
}