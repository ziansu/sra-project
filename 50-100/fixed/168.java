@java.lang.Override
public void onAnimationUpdate(final android.animation.ValueAnimator animator) {
    if (isVertical()) {
        getLayoutParams().height = java.lang.Integer.parseInt(animator.getAnimatedValue().toString());
    }else {
        getLayoutParams().width = java.lang.Integer.parseInt(animator.getAnimatedValue().toString());
    }
    requestLayout();
}