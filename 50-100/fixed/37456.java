@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent event) {
    if ((event.getAction()) == (android.view.MotionEvent.ACTION_DOWN)) {
        if (((popupwindow) != null) && (popupwindow.isShowing())) {
            popupwindow.dismiss();
            popupwindow = null;
        }
    }
    return super.onTouchEvent(event);
}