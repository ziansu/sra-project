@java.lang.Override
protected void setIcon_(final java.lang.String iconPath) {
    dispatch(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            dorkbox.systemTray.linux.jna.Gtk.gtk_status_icon_set_from_file(trayIcon, iconPath);
            if (!(isActive)) {
                isActive = true;
                dorkbox.systemTray.linux.jna.Gtk.gtk_status_icon_set_name(trayIcon, "SystemTray");
                dorkbox.systemTray.linux.jna.Gtk.gtk_status_icon_set_visible(trayIcon, true);
            }
        }
    });
}