private android.content.SharedPreferences getSharedPreferences() {
    android.content.SharedPreferences prefs = com.jana.android.core.app.AbstractApplication.getApplication().getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE);
    return prefs;
}