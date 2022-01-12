private static java.lang.String readFromSharedPrefs(java.lang.String key) {
    android.content.SharedPreferences settings = com.example.shashankshekhar.servicedemo.Logger.MqttLogger.applicationContext.getSharedPreferences(com.example.shashankshekhar.servicedemo.Logger.PREFS_NAME, 0);
    java.lang.String userName = settings.getString(key, "Anon");
    if (userName.equals("Anon")) {
        com.example.shashankshekhar.servicedemo.UtilityClasses.CommonUtils.printLog("shared prefs is null, returning Anon");
    }
    return userName;
}