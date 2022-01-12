@java.lang.Override
public void onAnimationUpdate(final android.animation.ValueAnimator animation) {
    pbProgress.setProgress(((int) (animation.getAnimatedValue())));
}