@java.lang.Override
public boolean dispatchTouchEvent(android.view.MotionEvent ev) {
    android.util.Log.e(com.junhzhan.cal.widget.CalendarWidgetNew.TAG, java.lang.String.format("view pager scrolling %s, action %d", mViewPagerScrolling, ev.getAction()));
    if ((mViewPagerScrolling) && ((ev.getAction()) == (android.view.MotionEvent.ACTION_DOWN))) {
        return true;
    }
    float scrolledPositionX = (ev.getX()) + (getScrollX());
    float scrolledPositionY = (ev.getY()) + (getScrollY());
    return super.dispatchTouchEvent(ev);
}