@java.lang.Override
public void onAnimationUpdate(final android.animation.ValueAnimator animator) {
    if (isVertical()) {
        getLayoutParams().height = ((int) (animator.getAnimatedValue()));
    }else {
        getLayoutParams().width = ((int) (animator.getAnimatedValue()));
    }
    requestLayout();
}