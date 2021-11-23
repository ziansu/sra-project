@java.lang.Override
public void onAnimationStart(android.animation.Animator animation) {
    isCount = true;
    setEnabled(false);
    onTimeListener.startTime();
}