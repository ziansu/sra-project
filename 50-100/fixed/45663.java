@java.lang.Override
public com.atomicleopard.thundr.notification.gae.GaeNotificationTarget store(java.lang.String username, java.lang.String clientId, com.atomicleopard.thundr.notification.NotificationType type, java.util.List<java.lang.String> categories) {
    com.atomicleopard.thundr.notification.gae.GaeNotificationTarget notificationTarget = new com.atomicleopard.thundr.notification.gae.GaeNotificationTarget(clientId, username, type, categories);
    com.googlecode.objectify.ObjectifyService.ofy().save().entity(notificationTarget).now();
    return notificationTarget;
}