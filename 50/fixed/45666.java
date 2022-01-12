@java.lang.Override
public boolean handleMessage(android.os.Message message) {
    if (((message.what) == (io.realm.BaseRealm.REALM_CHANGED)) && ((sharedGroupManager) != null)) {
        sharedGroupManager.advanceRead();
        sendNotifications();
    }
    return true;
}