private Notification.Builder createNotification(boolean playSound) {
    android.app.Notification.Builder notificationBuilder = new android.app.Notification.Builder(mContext).setCategory(Notification.CATEGORY_STATUS).setContentTitle(mContext.getString(R.string.service_transfer_title));
    if (playSound && (mSharedPreferences.getBoolean(mContext.getString(R.string.setting_notification_sound), false))) {
        notificationBuilder.setDefaults(Notification.DEFAULT_SOUND);
    }
    return notificationBuilder;
}