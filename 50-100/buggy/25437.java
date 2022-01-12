@java.lang.Override
public synchronized void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String key) {
    if (key == "username")
        this.username = sharedPreferences.getString("username", null);
    
    if (key == "password")
        this.password = sharedPreferences.getString("password", null);
    
}