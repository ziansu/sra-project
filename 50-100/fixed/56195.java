@java.lang.Override
public void onStop() {
    super.onStop();
    android.content.SharedPreferences myPrefs = getPreferences(tskaws.app.MODE_PRIVATE);
    android.content.SharedPreferences.Editor myPrefsEditor = myPrefs.edit();
    myPrefsEditor.putString("Application", this.app.sendAppToJson());
    myPrefsEditor.apply();
}