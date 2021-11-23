@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent event) {
    if (wasTouchEventOutsideBottomSheet(event)) {
        return false;
    }
    if (((event.getAction()) == (android.view.MotionEvent.ACTION_UP)) || ((event.getAction()) == (android.view.MotionEvent.ACTION_CANCEL))) {
        mViewDragHelper.processTouchEvent(event);
        return false;
    }
    mViewDragHelper.processTouchEvent(event);
    return true;
}