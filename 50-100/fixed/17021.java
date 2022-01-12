@java.lang.Override
public void onCompletion(com.app.sircle.WebService.NotificationResponse response, com.app.sircle.Utility.AppError error) {
    if (response != null) {
        if ((response.getData()) != null) {
            com.app.sircle.Manager.NotificationManager.notificationList = response.getData().getNotifications();
        }
    }
    notificationManagerListener.onCompletion(response, error);
}