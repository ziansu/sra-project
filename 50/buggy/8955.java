@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startid) {
    fetchRssItemsFromResources();
    return START_NOT_STICKY;
}