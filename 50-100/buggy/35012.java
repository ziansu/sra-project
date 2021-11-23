@java.lang.Override
public boolean onFling(android.view.MotionEvent e1, android.view.MotionEvent e2, float velocityX, float velocityY) {
    if ((mSingleFlingListener) != null) {
        if ((getScale()) > (DEFAULT_MIN_SCALE)) {
            return false;
        }
        if (((android.support.v4.view.MotionEventCompat.getPointerCount(e1)) > (com.lance.common.widget.photoview.PhotoViewAttacher.SINGLE_TOUCH)) || ((android.support.v4.view.MotionEventCompat.getPointerCount(e2)) > (com.lance.common.widget.photoview.PhotoViewAttacher.SINGLE_TOUCH))) {
            return false;
        }
        return mSingleFlingListener.onFling(e1, e2, velocityX, velocityY);
    }
    return false;
}