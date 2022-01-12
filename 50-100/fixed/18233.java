public void loadPreferences(android.content.SharedPreferences preferences) {
    proxy.setUsername(preferences.getString("username", null));
    proxy.setPassword(preferences.getString("password", null));
    proxy.setService(preferences.getString("service", null));
    proxy.setServer(preferences.getString("server", null));
}