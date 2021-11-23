@java.lang.SuppressWarnings(value = "FieldRepeatedlyAccessedInMethod")
@java.lang.Override
public void shutdown() {
    if (!(shuttingDown.getAndSet(true))) {
        dispatch(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                gtk.gtk_status_icon_set_visible(trayIcon, false);
                gobject.g_object_unref(trayIcon);
                trayIcon = null;
                gtkCallback = null;
            }
        });
        super.shutdown();
    }
}