public void setNotificationModels(final com.construction.pm.models.NotificationModel[] notificationModels) {
    mNotificationModelList = new java.util.ArrayList<com.construction.pm.models.NotificationModel>(java.util.Arrays.asList(notificationModels));
    notifyDataSetChanged();
}