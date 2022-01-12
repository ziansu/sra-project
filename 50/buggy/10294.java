@java.lang.Override
public void onAnimationEnd(android.animation.Animator animator) {
    if (this.isSystemShowing)
        setVisibility(View.GONE);
    
}