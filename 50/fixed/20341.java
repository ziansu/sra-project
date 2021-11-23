public void setNotificationModels(final com.construction.pm.models.NotificationModel[] notificationModels) {
    if (notificationModels != null)
        mNotificationModelList = new java.util.ArrayList<com.construction.pm.models.NotificationModel>(java.util.Arrays.asList(notificationModels));
    else
        mNotificationModelList = new java.util.ArrayList<com.construction.pm.models.NotificationModel>();
    
    notifyDataSetChanged();
}