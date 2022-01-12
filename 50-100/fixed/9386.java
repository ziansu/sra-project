private static void validateAccessToken() throws com.mapbox.mapboxsdk.exceptions.MapboxConfigurationException {
    java.lang.String accessToken = com.mapbox.mapboxsdk.Mapbox.INSTANCE.accessToken;
    if ((android.text.TextUtils.isEmpty(accessToken)) || ((!(accessToken.toLowerCase(MapboxConstants.MAPBOX_LOCALE).startsWith("pk."))) && (!(accessToken.toLowerCase(MapboxConstants.MAPBOX_LOCALE).startsWith("sk."))))) {
        throw new com.mapbox.mapboxsdk.exceptions.MapboxConfigurationException();
    }
}