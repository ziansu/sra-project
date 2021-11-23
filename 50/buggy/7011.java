@java.lang.Override
protected retrofit.client.Response executeServiceSync(retrofit.RestAdapter restAdapter) {
    return restAdapter.create(com.alorma.github.sdk.services.notifications.NotificationsService.class).markThreadAsRead(java.lang.String.valueOf(notification.id));
}