@java.lang.Override
public boolean dispatchTouchEvent(android.view.MotionEvent ev) {
    int action = ev.getAction();
    if (isEnabled()) {
        if ((action == (android.view.MotionEvent.ACTION_UP)) || (action == (android.view.MotionEvent.ACTION_CANCEL))) {
            rvOther.setEnabled(true);
        }else {
            rvOther.setEnabled(false);
        }
        return super.dispatchTouchEvent(ev);
    }else {
        return false;
    }
}