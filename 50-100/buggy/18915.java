@java.lang.Override
protected void onResume() {
    super.onResume();
    actionBarLayout.onResume();
    if (org.telegram.android.AndroidUtilities.isTablet()) {
        rightActionBarLayout.onResume();
        layersActionBarLayout.onResume();
    }
    org.telegram.messenger.Utilities.checkForCrashes(this);
    org.telegram.messenger.Utilities.checkForUpdates(this);
    org.telegram.messenger.ApplicationLoader.mainInterfacePaused = false;
    org.telegram.messenger.ConnectionsManager.getInstance().setAppPaused(false, false);
    updateCurrentConnectionState();
}