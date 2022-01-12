private static void checkCalendarLoaded() {
    if (!(com.unit5app.notifications.MyNotificationHandler.calendar.hasCalendarStartedLoading())) {
        android.util.Log.d("MyNotificationHandler", "Loading calendar");
        com.unit5app.notifications.MyNotificationHandler.calendar.loadCalendar(new com.unit5app.utils.MethodHolder(com.unit5app.notifications.MyNotificationHandler.class.getName(), "createNotificationsFromSettings", null));
    }
}