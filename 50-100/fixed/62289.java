@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    if (((view.getTag()) != null) && (view.getTag().equals("isCanceled"))) {
        return ;
    }
    android.view.ViewGroup root = ((android.view.ViewGroup) (view.getParent()));
    if (root != null) {
        root.removeView(view);
    }
    if (animatorListenerAdapter != null) {
        animatorListenerAdapter.onAnimationEnd(animation);
    }
}