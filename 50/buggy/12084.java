@java.lang.Override
public void onDestroy() {
    android.widget.Toast.makeText(this, "notification service destroyed", Toast.LENGTH_LONG).show();
    mNotificationsFileObserver.stopWatching();
}