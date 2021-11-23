@java.lang.Override
public void onAnimationStart(android.animation.Animator animation) {
    onAnimationEnd(animation);
    topSearch.setVisibility(View.VISIBLE);
}