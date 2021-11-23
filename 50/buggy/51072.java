@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    setFullscreen(true);
    if ((mControlsFrame) != null)
        mControlsFrame.setVisibility(View.INVISIBLE);
    
}