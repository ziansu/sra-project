@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    android.view.View targetView = mParent.getTargetView();
    if (targetView != null) {
        int targetViewTop = targetView.getTop();
        int targetViewOffset = (mParent.getTotalDragDistance()) - ((int) (getCurveYStart()));
        mOffsetAnimator.setIntValues(targetViewTop, (targetViewTop - targetViewOffset));
        mOffsetAnimator.start();
    }
}