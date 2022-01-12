public void PutStringPreferences(java.lang.String Name, java.lang.String Function) {
    settings = getSharedPreferences(Name, 0);
    editor = settings.edit();
    editor.putString(Name, Function);
    editor.commit();
}