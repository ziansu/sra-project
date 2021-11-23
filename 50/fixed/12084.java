@java.lang.Override
public void onDestroy() {
    mNotificationsFileObserver.stopWatching();
}