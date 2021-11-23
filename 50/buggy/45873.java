@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    listener.onAnimationEnd(view);
    view.setVisibility(View.GONE);
}