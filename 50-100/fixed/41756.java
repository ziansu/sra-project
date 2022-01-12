@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    if ((!(canceled)) && ((animator) != null)) {
        if ((from != null) && ((!isPush) || (removesFromViewOnPush))) {
            container.removeView(from);
        }
        changeListener.onChangeCompleted();
        animator.removeListener(this);
        if (isPush && (from != null)) {
            resetFromView(from);
        }
        animator = null;
    }
}