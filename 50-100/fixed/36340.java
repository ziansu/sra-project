@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    if (((!(mFadeInAdjacentScreens)) && stateIsNormal) && oldStateIsSmall) {
        for (int i = 0; i < (getChildCount()); i++) {
            final com.cyanogenmod.trebuchet.CellLayout cl = ((com.cyanogenmod.trebuchet.CellLayout) (getChildAt(i)));
            cl.setAlpha(1.0F);
        }
    }
}