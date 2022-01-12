public static boolean requestAutoTracking(@android.support.annotation.NonNull
android.content.Context context, @android.support.annotation.NonNull
java.lang.Class tClass) {
    if ((!(com.adsamcik.signalcollector.services.ActivityService.backgroundTracking)) && ((com.adsamcik.signalcollector.utility.Preferences.get(context).getInt(Preferences.PREF_AUTO_TRACKING, Preferences.DEFAULT_AUTO_TRACKING)) > 0)) {
        if (com.adsamcik.signalcollector.services.ActivityService.requestActivity(context, tClass.hashCode(), com.adsamcik.signalcollector.utility.Preferences.get(context).getInt(Preferences.PREF_ACTIVITY_UPDATE_RATE, Preferences.DEFAULT_ACTIVITY_UPDATE_RATE), true)) {
            com.adsamcik.signalcollector.services.ActivityService.backgroundTracking = true;
            return true;
        }
    }
    return false;
}