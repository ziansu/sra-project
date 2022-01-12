@java.lang.Override
public void onAnimationEnd(android.view.animation.Animation animation) {
    setFadeOutAnimation();
    if ((mFabVisibility) == (android.view.View.VISIBLE))
        mFloatingActionButton.setVisibility(View.INVISIBLE);
    
}