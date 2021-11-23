@java.lang.Override
protected void onPause() {
    super.onPause();
    overridePendingTransition(0, 0);
    if ((chatActivityEnterView) != null) {
        chatActivityEnterView.hidePopup(false);
        chatActivityEnterView.setFieldFocused(false);
    }
    org.telegram.tgnet.ConnectionsManager.getInstance().setAppPaused(true, false);
    if (!(wakeLock.isHeld())) {
        wakeLock.release();
    }
}