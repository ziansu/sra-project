@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    super.onAnimationEnd(animation);
    if (((getAppBar()) != null) && ((getFab().getY()) != (getFabNewY()))) {
        getFab().setAlpha(0.0F);
        getFab().setY(getFabNewY());
        getFab().animate().alpha(1.0F).setDuration(200).setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator()).start();
    }
}