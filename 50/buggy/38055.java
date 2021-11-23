@java.lang.Override
public void onAnimationUpdate(android.animation.ValueAnimator animation) {
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.HONEYCOMB)) {
        pbProgress.setProgress(((int) (animation.getAnimatedValue())));
    }
}