@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent event) {
    if ((!(mPopped)) && ((event.getAction()) == (android.view.MotionEvent.ACTION_DOWN))) {
        mListener.popBalloon(this, true);
        mPopped = true;
        mAnimator.cancel();
    }
    return super.onTouchEvent(event);
}