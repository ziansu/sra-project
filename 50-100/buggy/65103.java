public static java.lang.Boolean checkROMVersion(android.content.Context context) {
    android.content.SharedPreferences prefs = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
    if (!(prefs.contains("build_date"))) {
        projekt.substratum.config.References.setROMVersion(context);
    }
    return (prefs.getInt("build_date", 0)) == (java.lang.Integer.parseInt(projekt.substratum.config.References.getProp("ro.build.date.utc")));
}