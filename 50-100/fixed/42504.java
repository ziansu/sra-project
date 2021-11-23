@java.lang.Override
public void onAnimationUpdate(android.animation.ValueAnimator animation) {
    if ((arcProcess.getProgress()) >= offset2) {
        arcProcess.setProgress(offset2);
    }else {
        arcProcess.setProgress(java.lang.Math.round(((arcProcess.getProgress()) + ((float) (animation.getAnimatedValue())))));
    }
}