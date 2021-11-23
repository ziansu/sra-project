public void loadPreferences(android.content.SharedPreferences preferences) {
    proxy.setUsername(preferences.getString("username", ""));
    proxy.setPassword(preferences.getString("password", ""));
    proxy.setService(preferences.getString("service", ""));
    proxy.setServer(preferences.getString("server", ""));
}