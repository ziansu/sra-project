private int getIntPreference(java.lang.String prefString, android.content.SharedPreferences prefs, java.lang.String defaultSetting) {
    java.lang.String regOffsetString = prefs.getString(prefString, defaultSetting);
    int prefResult = 0;
    try {
        prefResult = java.lang.Integer.valueOf(regOffsetString);
    } catch (java.lang.Exception e) {
        android.util.Log.e("stuff", e.toString());
        prefResult = 0;
    }
    return prefResult;
}