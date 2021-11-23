@java.lang.Override
public boolean onSingleTapUp(android.view.MotionEvent e) {
    switch (mCurrentPictureState) {
        case com.mickaelg.lookanimation.ui.LookAnimationDelegate.STATE_NOT_ZOOMED :
            mCurrentPictureState = com.mickaelg.lookanimation.ui.LookAnimationDelegate.STATE_UPPER_BODY;
            zoomInPicture();
            slideInUpperBodyLayout();
            break;
        case com.mickaelg.lookanimation.ui.LookAnimationDelegate.STATE_UPPER_BODY :
            mCurrentPictureState = com.mickaelg.lookanimation.ui.LookAnimationDelegate.STATE_NOT_ZOOMED;
            zoomOutPicture();
            slideOutUpperBodyLayout();
            break;
        case com.mickaelg.lookanimation.ui.LookAnimationDelegate.STATE_LOWER_BODY :
            mCurrentPictureState = com.mickaelg.lookanimation.ui.LookAnimationDelegate.STATE_NOT_ZOOMED;
            zoomOutPicture();
            slideOutLowerBodyLayout();
    }
    return true;
}