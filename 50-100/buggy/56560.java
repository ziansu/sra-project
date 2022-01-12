@java.lang.Override
public boolean dispatchTouchEvent(android.view.MotionEvent event) {
    final android.view.ViewParent parent = getParent();
    if (parent != null) {
        switch (event.getAction()) {
            case android.view.MotionEvent.ACTION_DOWN :
                parent.requestDisallowInterceptTouchEvent(true);
                break;
            case android.view.MotionEvent.ACTION_UP :
                parent.requestDisallowInterceptTouchEvent(true);
                break;
        }
    }
    return super.dispatchTouchEvent(event);
}