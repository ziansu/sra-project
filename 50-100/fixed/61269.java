public void saveNewMyNotifications(java.util.List<com.kosbrother.mongmongwoo.mynotification.MyNotification> newMyNotifications) {
    java.util.List<com.kosbrother.mongmongwoo.mynotification.MyNotification> mySavedNotifications = getMySavedNotifications();
    int sizeOfNewNotifications = newMyNotifications.size();
    int sizeOfSavedNotifications = mySavedNotifications.size();
    for (int i = 0; i < (sizeOfNewNotifications - sizeOfSavedNotifications); i++) {
        mySavedNotifications.add(i, newMyNotifications.get(i));
    }
    sharedPreferences.edit().putString(com.kosbrother.mongmongwoo.mynotification.MyNotificationManager.keyOfMyReadNotifications, new com.google.gson.Gson().toJson(mySavedNotifications)).apply();
}