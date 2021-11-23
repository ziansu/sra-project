@java.lang.Override
public void onNotificationRemoved(android.service.notification.StatusBarNotification sbn) {
    android.util.Log.w(logTAG, (((("Notification REMOVED*************** " + ("User: " + " Package Name: ")) + (sbn.getPackageName())) + " ID: ") + (sbn.getId())));
    if (!(canUseNotif(sbn)))
        return ;
    
    io.internetthings.sailfish.SailfishMessage sm = new io.internetthings.sailfish.SailfishMessage();
    sm.Action = MessageActions.REMOVE_NOTIFICATION;
    sm.ID = getMessageID(sbn);
    sendMessage(sm);
}