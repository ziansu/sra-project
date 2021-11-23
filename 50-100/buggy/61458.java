@java.lang.Override
public void show(android.app.FragmentManager fragmentManager, java.lang.String tag) {
    if (!(com.hijacker.MainActivity.background))
        super.show(fragmentManager, tag);
    else {
        if (this.watchdog) {
            com.hijacker.MainActivity.error_notif.setContentTitle(com.hijacker.ErrorDialog.notification2_title);
            com.hijacker.MainActivity.error_notif.setContentText(title);
            com.hijacker.MainActivity.watchdog_thread = new java.lang.Thread(com.hijacker.MainActivity.watchdog_runnable);
            com.hijacker.MainActivity.watchdog_thread.start();
        }else {
            com.hijacker.MainActivity.error_notif.setContentTitle(title);
            com.hijacker.MainActivity.error_notif.setContentText(message);
        }
        com.hijacker.MainActivity.mNotificationManager.notify(1, com.hijacker.MainActivity.error_notif.build());
    }
}