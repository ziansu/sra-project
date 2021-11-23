private void updateTotalUserInterface() {
    calculateScreenConfiguration();
    updateWindowParams();
    updateLayoutParams();
    if ((mOrientation) == (android.content.res.Configuration.ORIENTATION_LANDSCAPE)) {
        if (isAttachedToWindow()) {
            hide();
        }
    }
}