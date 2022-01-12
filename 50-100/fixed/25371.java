@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    android.view.View targetView = mParent.getTargetView();
    if (targetView != null) {
        mOffsetAnimator.setIntValues(targetView.getTop(), ((int) (getCurveYStart())));
        mOffsetAnimator.start();
    }
}