public static void addLocked(android.content.Context context, java.lang.String app) {
    java.util.List<java.lang.String> lockedApp = anand.android.applockcloneminapi23.utils.SharedPref.getLocked(context);
    if (lockedApp == null)
        lockedApp = new java.util.ArrayList<java.lang.String>();
    
    lockedApp.add(app);
    anand.android.applockcloneminapi23.utils.SharedPref.saveLocked(context, lockedApp);
}