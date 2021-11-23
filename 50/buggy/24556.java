@java.lang.Override
protected void onResume() {
    super.onResume();
    android.content.Intent cancelPendingFoodNotifications = new android.content.Intent(this, de.tum.in.tumcampusapp.services.FavoriteDishAlarmScheduler.class);
    cancelPendingFoodNotifications.putExtra(FavoriteDishAlarmScheduler.INTENT_CANCEL_ALL_NOTIFICATIONS, true);
    sendBroadcast(cancelPendingFoodNotifications);
}