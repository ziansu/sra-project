@java.lang.Override
public void onAnimationEnd(android.view.animation.Animation animation) {
    ((android.view.ViewGroup) (getParent())).removeView(this);
    if ((callback) != null) {
        callback.onAnimationFinished();
    }
}