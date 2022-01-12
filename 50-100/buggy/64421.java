@java.lang.Override
public void onViewReleased(android.view.View releasedChild, float xvel, float yvel) {
    if (yvel > (MINVEL)) {
        dismiss(releasedChild, yvel);
    }else {
        if ((releasedChild.getTop()) >= ((top) + ((height) / 2))) {
            dismiss(releasedChild, yvel);
        }else {
            mDragHelper.smoothSlideViewTo(releasedChild, 0, top);
        }
    }
    android.support.v4.view.ViewCompat.postInvalidateOnAnimation(this);
}