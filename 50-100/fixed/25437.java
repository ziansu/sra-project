@java.lang.Override
public synchronized void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String key) {
    if (key.equals("username")) {
        this.username = sharedPreferences.getString("username", null);
        return ;
    }
    if (key.equals("password")) {
        this.password = sharedPreferences.getString("password", null);
        return ;
    }
}