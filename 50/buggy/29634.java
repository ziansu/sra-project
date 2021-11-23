@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent event) {
    return (mOnImageViewListener.onTouchEvent(event)) || (super.onTouchEvent(event));
}