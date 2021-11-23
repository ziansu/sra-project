private static void addLocationsListToSharedPreferences(android.app.Activity activity, java.util.ArrayList<com.scv.slackgo.models.Location> locations) {
    com.google.gson.Gson gson = new com.google.gson.Gson();
    java.lang.String locationsJSON = gson.toJson(locations);
    android.content.SharedPreferences sharedPreferences = activity.getSharedPreferences(Constants.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE);
    android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
    editor.putString(Constants.SHARED_PREFERENCES_LOCATIONS, locationsJSON);
    editor.commit();
}