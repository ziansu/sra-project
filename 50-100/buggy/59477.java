@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent ev) {
    if ((menu.isVisible()) && (menuContainsTouch(ev))) {
        ev.offsetLocation(0, (-((getHeight()) - (menu.getHeight()))));
        menu.onTouchEvent(ev);
        drawer.setOnTouchListener(null);
    }
    return true;
}