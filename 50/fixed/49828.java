@java.lang.Override
public void onAnimationCancel(android.animation.Animator animation) {
    changeListener.onChangeCompleted();
}