private android.content.DialogInterface.OnClickListener setIgnore() {
    android.content.SharedPreferences.Editor editor = preferences.edit();
    TTSignore = true;
    editor.putBoolean("TTSignore", TTSignore);
    editor.commit();
    return null;
}