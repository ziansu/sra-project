@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    undoPendingDismiss();
    performDismiss(downView, downPosition);
    mCallbacks.onViewSwiped(downPosition);
}