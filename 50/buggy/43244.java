@java.lang.Override
public void onShowPress(android.view.MotionEvent e) {
    java.lang.System.out.println("-------OnGestureListener:onShowPress()");
    mAnimMode = 0;
    super.onShowPress(e);
}