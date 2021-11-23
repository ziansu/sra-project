@java.lang.Override
public boolean onTouchEvent(final android.view.MotionEvent ev) {
    return (!(lockMode.allowsTouch())) || (super.onTouchEvent(ev));
}