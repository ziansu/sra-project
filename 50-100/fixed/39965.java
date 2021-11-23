@java.lang.Override
protected void setIcon_(final java.lang.String iconPath) {
    dispatch(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            gtk.gtk_status_icon_set_from_file(trayIcon, iconPath);
            if (!(isActive)) {
                isActive = true;
                gtk.gtk_status_icon_set_visible(trayIcon, true);
            }
        }
    });
}