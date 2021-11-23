private java.lang.String rollBack() {
    java.lang.String lastVersion = sp.getString("lastVersion", null);
    android.content.SharedPreferences.Editor editor = sp.edit();
    if (lastVersion == null) {
        editor.remove("currentVersion");
    }else {
        editor.putString("currentVersion", lastVersion);
    }
    editor.putBoolean("firstTimeOk", true);
    editor.putBoolean("firstTime", false);
    editor.putBoolean("rolledBack", true);
    editor.apply();
    return lastVersion;
}