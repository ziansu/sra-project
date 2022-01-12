public static void init(android.content.Context appContext) {
    com.unit5app.Settings.load(com.unit5app.notifications.MyNotificationHandler.context);
    com.unit5app.notifications.MyNotificationHandler.context = appContext;
    com.unit5app.notifications.MyNotificationHandler.calendar = new com.unit5app.calendars.Unit5Calendar(60, false);
    com.unit5app.notifications.MyNotificationHandler.checkCalendarLoaded();
}