public static void sendEvent(android.app.Activity activity, @android.support.annotation.StringRes
int eventNameId, java.util.Map<java.lang.String, java.lang.String> eventInfo) {
    if (eventNameId == 0) {
        android.util.Log.w(com.massivedisaster.adal.analytics.FirebaseAnalyticsManager.class.getCanonicalName(), "You need a eventName to send the Event");
        return ;
    }
    com.massivedisaster.adal.analytics.FirebaseAnalyticsManager.sendEvent(activity, activity.getString(eventNameId), eventInfo);
}