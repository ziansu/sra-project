@java.lang.Override
public void onAnimationEnd(android.animation.Animator animator) {
    try {
        mWindowManager.removeViewImmediate(mLayout);
        mLayout = null;
    } catch (java.lang.Exception e) {
    }
}