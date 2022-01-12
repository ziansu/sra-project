@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent event) {
    tapX = event.getX();
    tapY = event.getY();
    org.opencv.core.Point tappedPoint = new org.opencv.core.Point(tapX, tapY);
    if (tappedPoint.inside(mROI)) {
        mSoccerGame.setPickupButtonPressedTrue();
    }else {
        mSoccerGame.passBall();
    }
    return super.onTouchEvent(event);
}