@java.lang.Override
public boolean dispatchTouchEvent(android.view.MotionEvent ev) {
    int action = ev.getAction();
    if (isEnabled()) {
        if ((action == (android.view.MotionEvent.ACTION_UP)) || (action == (android.view.MotionEvent.ACTION_CANCEL))) {
            rvOther.setEnabled(true);
        }else {
            rvOther.setEnabled(false);
        }
    }
    if (action == (android.view.MotionEvent.ACTION_DOWN)) {
        rvOther.setEnabled(false);
        this.setEnabled(true);
    }
    return super.dispatchTouchEvent(ev);
}