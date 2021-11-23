@java.lang.Override
public void run() {
    this.blockUntilStarted.countDown();
    try {
        dorkbox.util.tray.linux.GtkSystemTray.libgtk.gtk_main();
    } catch (java.lang.Throwable t) {
        logger.warn("Unable to run main loop", t);
    }
}