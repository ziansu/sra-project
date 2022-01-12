public static void addLocked(android.content.Context context, anand.android.applockcloneminapi23.views.adapters.modle.AppInfo app) {
    java.util.ArrayList<anand.android.applockcloneminapi23.views.adapters.modle.AppInfo> lockedApp = anand.android.applockcloneminapi23.utils.SharedPref.getLocked(context);
    if (lockedApp == null)
        lockedApp = new java.util.ArrayList<anand.android.applockcloneminapi23.views.adapters.modle.AppInfo>();
    
    lockedApp.add(app);
    anand.android.applockcloneminapi23.utils.SharedPref.saveLocked(context, lockedApp);
}