public void PutBooleanPreferences(java.lang.String Name, boolean Function) {
    settings = getSharedPreferences(Name, 0);
    editor = settings.edit();
    editor.putBoolean(Name, Function);
    editor.commit();
}