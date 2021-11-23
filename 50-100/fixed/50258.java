private void cancelPreloadRecentApps() {
    if (keyguardOn()) {
        return ;
    }
    if (mOmniSwitchRecents) {
        return ;
    }
    if (mPreloadedRecentApps) {
        mPreloadedRecentApps = false;
        com.android.server.statusbar.StatusBarManagerInternal statusbar = getStatusBarManagerInternal();
        if (statusbar != null) {
            statusbar.cancelPreloadRecentApps();
        }
    }
}