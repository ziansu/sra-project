@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    startedAnimators.remove(animation);
    view.setInAnimation(false);
}