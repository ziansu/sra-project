public static boolean saveLocationCoordinatesSettings(android.content.Context context, com.example.muresand.simpleweatherapp.server.CoordinatesDto coordinatesData) {
    if (context == null) {
        return false;
    }
    android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.AppName, Context.MODE_PRIVATE);
    android.content.SharedPreferences.Editor sharedPreferenceEditor = sharedPreferences.edit();
    sharedPreferenceEditor.putLong(com.example.muresand.simpleweatherapp.util.Constants.KEY_LATITUDE, java.lang.Double.doubleToRawLongBits(coordinatesData.getLatitude()));
    sharedPreferenceEditor.putLong(com.example.muresand.simpleweatherapp.util.Constants.KEY_LONGITUDE, java.lang.Double.doubleToRawLongBits(coordinatesData.getLongitude()));
    sharedPreferenceEditor.commit();
    return true;
}