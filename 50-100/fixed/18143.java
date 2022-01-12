private void preloadRecentApps() {
    if (keyguardOn()) {
        return ;
    }
    if (mOmniSwitchRecents) {
        com.android.internal.util.cmremix.CMRUtils.preloadOmniSwitchRecents(mContext, UserHandle.CURRENT);
        return ;
    }
    mPreloadedRecentApps = true;
    com.android.server.statusbar.StatusBarManagerInternal statusbar = getStatusBarManagerInternal();
    if (statusbar != null) {
        statusbar.preloadRecentApps();
    }
}