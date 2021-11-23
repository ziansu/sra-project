public static void proxyClick(final dorkbox.systemTray.Entry menuEntry, final java.awt.event.ActionListener callback) {
    dorkbox.systemTray.jna.linux.Gtk.isDispatch.set(true);
    try {
        callback.actionPerformed(new java.awt.event.ActionEvent(menuEntry, java.awt.event.ActionEvent.ACTION_PERFORMED, ""));
    } finally {
        dorkbox.systemTray.jna.linux.Gtk.isDispatch.set(false);
    }
}