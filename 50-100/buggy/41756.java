@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    if (((from != null) && ((!isPush) || (removesFromViewOnPush))) && (!(canceled))) {
        container.removeView(from);
    }
    changeListener.onChangeCompleted();
    animator.removeListener(this);
    if (isPush && (from != null)) {
        resetFromView(from);
    }
    animator = null;
}