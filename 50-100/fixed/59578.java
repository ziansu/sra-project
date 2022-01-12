@java.lang.Override
public void onAnimationUpdate(android.animation.ValueAnimator animation) {
    if ((arcStore.getProgress()) >= offset) {
        arcStore.setProgress(offset);
    }else {
        arcStore.setProgress(java.lang.Math.round(((arcStore.getProgress()) + ((float) (animation.getAnimatedValue())))));
    }
}