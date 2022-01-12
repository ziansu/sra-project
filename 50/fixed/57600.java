private void showThenAutoHideControls() {
    if (!(isFinishing())) {
        fullScreen.show();
        fullScreen.delayedHide();
        videoControls.show();
    }
}