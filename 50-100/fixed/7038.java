@java.lang.Override
public void setEnabled(boolean enabled) {
    super.setEnabled(enabled);
    if ((isProgress) || ((mSuccessAnimationState) >= (com.miruker.fabprogress.Fab.SUCCESS_ANIMATION.ON))) {
        setAlpha(1.0F);
    }else {
        setAlpha((enabled ? 1.0F : com.miruker.fabprogress.Fab.FAB_DISABLED_ALPHA));
    }
}