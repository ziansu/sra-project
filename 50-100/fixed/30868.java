public static void sendUserProperty(android.app.Activity activity, @android.support.annotation.StringRes
int propertyId, java.lang.String value) {
    if (propertyId == 0) {
        android.util.Log.w(com.massivedisaster.adal.analytics.FirebaseAnalyticsManager.class.getCanonicalName(), "You need a propertyId to send the User Property");
        return ;
    }
    com.massivedisaster.adal.analytics.FirebaseAnalyticsManager.sendUserProperty(activity, activity.getString(propertyId), value);
}