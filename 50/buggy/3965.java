@java.lang.Override
public boolean onDown(android.view.MotionEvent e) {
    mIsPrepressed = true;
    mPressedView = recyclerView.findChildViewUnder(e.getX(), e.getY());
    super.onDown(e);
    return false;
}