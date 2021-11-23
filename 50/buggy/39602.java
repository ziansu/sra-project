@java.lang.Override
public void onNotificationGridRefresh(org.iplantc.de.notifications.client.events.NotificationGridRefreshEvent event) {
    if ((listStore.size()) > 0) {
        toolbar.setDeleteAllButtonEnabled(true);
        toolbar.setMarkAsSeenButtonEnabled(true);
    }else {
        toolbar.setDeleteAllButtonEnabled(false);
    }
}