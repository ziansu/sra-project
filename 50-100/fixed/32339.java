@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent ev) {
    switch (ev.getAction()) {
        case android.view.MotionEvent.ACTION_UP :
            int scrollX = getScrollX();
            if (scrollX < ((mMenuWidth) / 2)) {
                showMenu();
            }else {
                hideMenu();
            }
            return true;
    }
    return super.onTouchEvent(ev);
}