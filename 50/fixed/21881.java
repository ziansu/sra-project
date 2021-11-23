@java.lang.Override
protected void executeService(retrofit.RestAdapter restAdapter) {
    restAdapter.create(com.alorma.github.sdk.services.notifications.NotificationsService.class).markThreadAsRead(java.lang.String.valueOf(notification.id), new java.lang.Object(), this);
}