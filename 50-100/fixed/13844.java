public void showMatch(android.view.View view) {
    itemsAdapter.add("Kakan");
    android.content.SharedPreferences sharedPreferences = getSharedPreferences(dat255.chalmers.com.welcome.SharedPreferencesKeys.PREFS_NAME, 0);
    java.lang.String token = sharedPreferences.getString(dat255.chalmers.com.welcome.SharedPreferencesKeys.AUTH_TOKEN, "");
    java.lang.System.out.println(token);
    dat255.chalmers.com.welcome.BackendInterfaces.BackendConnection backendConnection = new dat255.chalmers.com.welcome.BackendInterfaces.BackendConnection(this);
    backendConnection.execute("match", "", "GET", token);
}