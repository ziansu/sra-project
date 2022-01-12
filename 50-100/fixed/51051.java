@java.lang.Override
public com.pratilipi.data.type.Notification getNotification(java.lang.Long userId, com.pratilipi.common.type.NotificationType type, java.lang.Long sourceId) {
    return com.googlecode.objectify.ObjectifyService.ofy().load().type(com.pratilipi.data.type.gae.NotificationEntity.class).filter("USER_ID", userId).filter("TYPE", type).filter("SOURCE_ID", sourceId.toString()).order("-LAST_UPDATED").first().now();
}