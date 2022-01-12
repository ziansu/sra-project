@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    mAnimator = null;
    if ((mTouchedDotView.getOnDotStateChangedListener()) != null) {
        mTouchedDotView.getOnDotStateChangedListener().onDismissed(mTouchedDotView);
    }
    dismissed();
}