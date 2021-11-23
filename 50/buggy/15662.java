@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent ev) {
    super.onTouchEvent(ev);
    android.util.Log.i("VerticalScrollView", ("onTouchEvent. action: " + (ev.getAction())));
    return true;
}