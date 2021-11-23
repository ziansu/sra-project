@java.lang.Override
protected void setIcon_(final java.lang.String iconPath) {
    dorkbox.systemTray.linux.jna.GtkSupport.dispatch(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            dorkbox.systemTray.linux.AppIndicatorTray.appindicator.app_indicator_set_icon(appIndicator, iconPath);
            if (!(isActive)) {
                isActive = true;
                dorkbox.systemTray.linux.AppIndicatorTray.appindicator.app_indicator_set_status(appIndicator, AppIndicator.STATUS_ACTIVE);
            }
        }
    });
}