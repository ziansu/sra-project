public int getNotificationMethod(short time) {
    return mSharedPreferences.getInt(islam.adhanalarm.Preferences.KEY_NOTIFICATION_METHOD.concat(java.lang.Short.toString(time)), ((CONSTANT.SUNRISE) == time ? CONSTANT.NOTIFICATION_NONE : CONSTANT.NOTIFICATION_DEFAULT));
}