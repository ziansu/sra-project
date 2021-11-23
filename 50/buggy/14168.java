@java.lang.Override
public void onAnimationEnd(android.view.animation.Animation animation) {
    if (showTargetArc) {
        addArcAnimation(activity);
    }else {
        addPathAnimation(activity);
    }
}