@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    mAnimator = null;
    mTouchedDotView.getOnDotStateChangedListener().onDismissed(mTouchedDotView);
    dismissed();
}