@java.lang.Override
public void run() {
    com.pushwoosh.module.PushnotificationsModule.INSTANCE.notifyPushReceived(messageData);
    com.pushwoosh.module.PushnotificationsModule.INSTANCE.notifyPushOpened(messageData);
}