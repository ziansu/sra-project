private java.lang.String rollBack() {
    java.lang.String lastVersion = sp.getString("lastVersion", null);
    if (lastVersion == null) {
        throw new java.lang.Error("This should never happen");
    }
    android.content.SharedPreferences.Editor editor = sp.edit();
    editor.putString("currentVersion", lastVersion);
    editor.putBoolean("firstTimeOk", true);
    editor.putBoolean("firstTime", false);
    editor.putBoolean("rolledBack", true);
    editor.apply();
    return lastVersion;
}