@java.lang.Override
public boolean onScroll(android.view.MotionEvent e1, android.view.MotionEvent e2, float distanceX, float distanceY) {
    act.dummyMoveTo(e2.getRawX(), e2.getRawY());
    p.show(((int) (e2.getRawX())), ((int) (e2.getRawY())));
    return true;
}