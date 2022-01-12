public static java.lang.String getGcmInfoNotificationData(android.app.Activity context, java.lang.String notificationData) {
    try {
        java.lang.String language = bg.znestorov.sofbus24.utils.LanguageChange.getUserLocale(context);
        org.json.JSONObject notificationJson = new org.json.JSONObject(notificationData);
        notificationData = notificationJson.getString(language);
    } catch (org.json.JSONException e) {
        notificationData = "";
    }
    return notificationData;
}