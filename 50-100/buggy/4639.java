@java.lang.Override
public boolean apply(org.eclipse.emf.common.notify.Notification notification) {
    boolean isRemoveNotif = ((notification.getEventType()) == (org.eclipse.emf.common.notify.Notification.REMOVE)) || ((notification.getEventType()) == (org.eclipse.emf.common.notify.Notification.REMOVE_MANY));
    return isRemoveNotif && (new org.eclipse.sirius.common.tools.api.query.NotificationQuery(notification).isTransientNotification());
}