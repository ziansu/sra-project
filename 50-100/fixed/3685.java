@java.lang.Override
public void onAnimationEnd(android.view.animation.Animation animation) {
    mImage.clearAnimation();
    edu.chalmers.meetandguess.FrameLayout.LayoutParams layoutParams = ((edu.chalmers.meetandguess.FrameLayout.LayoutParams) (slot.getLayoutParams()));
    android.view.ViewGroup oldparent = ((android.view.ViewGroup) (mImage.getParent()));
    oldparent.removeView(mImage);
    mImage.setLayoutParams(layoutParams);
    parent.addView(mImage);
    mImage.setVisibility(View.VISIBLE);
    if (wrongGuess) {
        overlayIcon(viewTouched, false);
        wrongGuess = true;
    }
}