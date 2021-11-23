public static com.example.muresand.simpleweatherapp.server.CoordinatesDto loadLocationCoordinatesSettings(android.content.Context context) {
    if (context == null) {
        return null;
    }
    android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.AppName, Context.MODE_PRIVATE);
    double latitude = java.lang.Double.longBitsToDouble(sharedPreferences.getLong(com.example.muresand.simpleweatherapp.util.Constants.KEY_LATITUDE, java.lang.Double.doubleToLongBits(0)));
    double longitude = java.lang.Double.longBitsToDouble(sharedPreferences.getLong(com.example.muresand.simpleweatherapp.util.Constants.KEY_LONGITUDE, java.lang.Double.doubleToLongBits(0)));
    com.example.muresand.simpleweatherapp.server.CoordinatesDto coords = new com.example.muresand.simpleweatherapp.server.CoordinatesDto(latitude, longitude);
    return coords;
}