public static DaoMaster.DevOpenHelper getDB(android.content.Context context) {
    android.content.SharedPreferences prefs = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
    boolean firstTime = prefs.getBoolean("FIRST_TIME", true);
    if (firstTime) {
        if (com.noandroid.familycontacts.model.DatabaseHelper.copyDatabase(context))
            prefs.edit().putBoolean("FIRST_TIME", false).commit();
        
    }
    return new com.noandroid.familycontacts.model.DaoMaster.DevOpenHelper(context, "contacts-db", null);
}