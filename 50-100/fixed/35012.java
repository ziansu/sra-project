@java.lang.Override
public boolean onFling(android.view.MotionEvent e1, android.view.MotionEvent e2, float velocityX, float velocityY) {
    return ((((mSingleFlingListener) != null) && ((getScale()) <= (DEFAULT_MIN_SCALE))) && (!(((e1.getPointerCount()) > (com.lance.common.widget.photoview.PhotoViewAttacher.SINGLE_TOUCH)) || ((e2.getPointerCount()) > (com.lance.common.widget.photoview.PhotoViewAttacher.SINGLE_TOUCH))))) && (mSingleFlingListener.onFling(e1, e2, velocityX, velocityY));
}