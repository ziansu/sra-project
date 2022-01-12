@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent ev) {
    if (menuContainsTouch(ev)) {
        ev.offsetLocation(0, (-((getHeight()) - (menu.getHeight()))));
        menu.onTouchEvent(ev);
    }
    return true;
}