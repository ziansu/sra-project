public static double[] getLocationAlert(com.familyparking.app.service.LocationService locationService, android.content.Context context) {
    double[] position;
    position = com.familyparking.app.utility.Tools.getLocationGPS(locationService, context);
    if (position == null) {
        position = com.familyparking.app.utility.Tools.getLocationNetwork(locationService, context);
        if (position == null) {
            com.familyparking.app.utility.Tools.showSettingsAlert(context);
        }
    }
    return position;
}