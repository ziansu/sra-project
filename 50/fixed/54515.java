private void updateTotalUserInterface() {
    calculateScreenConfiguration();
    updateWindowParams();
    updateLayoutParams();
    if (isAttachedToWindow()) {
        hide();
    }
}