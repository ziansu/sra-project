@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    progressIndicator.setAlpha(0.0F);
    progressIndicator.setVisibility(View.GONE);
    if (afterAnimationAction != null)
        try {
            afterAnimationAction.run();
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e);
        }
    
}