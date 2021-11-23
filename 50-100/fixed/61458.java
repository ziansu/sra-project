@java.lang.Override
public void show(android.app.FragmentManager fragmentManager, java.lang.String tag) {
    if (!(com.hijacker.MainActivity.background))
        super.show(fragmentManager, tag);
    else {
        com.hijacker.MainActivity.error_notif.setContentTitle(title);
        com.hijacker.MainActivity.error_notif.setContentText(message);
        com.hijacker.MainActivity.mNotificationManager.notify(1, com.hijacker.MainActivity.error_notif.build());
    }
}