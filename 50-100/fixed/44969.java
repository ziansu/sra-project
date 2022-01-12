@java.lang.Override
public void run() {
    for (java.util.Map.Entry<java.lang.Long, java.util.ArrayList<org.telegram.objects.MessageObject>> pair : messages.entrySet()) {
        java.lang.Long key = pair.getKey();
        java.util.ArrayList<org.telegram.objects.MessageObject> value = pair.getValue();
        updateInterfaceWithMessages(key, value);
    }
    org.telegram.messenger.NotificationCenter.getInstance().postNotificationName(org.telegram.android.MessagesController.dialogsNeedReload);
}