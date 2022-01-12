@java.lang.Override
public void run() {
    this.blockUntilStarted.countDown();
    dorkbox.util.tray.linux.GtkSystemTray.libgtk.gtk_main();
}