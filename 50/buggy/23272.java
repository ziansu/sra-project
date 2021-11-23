@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    isCount = false;
    setText(overtxt);
    onTimeListener.endTime();
}