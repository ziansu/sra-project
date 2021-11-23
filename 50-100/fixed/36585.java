@java.lang.Override
public void shutdown() {
    if (!(shuttingDown.getAndSet(true))) {
        dispatch(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                dorkbox.systemTray.linux.AppIndicatorTray.appindicator.app_indicator_set_status(appIndicator, AppIndicator.STATUS_PASSIVE);
                com.sun.jna.Pointer p = appIndicator.getPointer();
                gobject.g_object_unref(p);
                appIndicator = null;
            }
        });
        super.shutdown();
    }
}