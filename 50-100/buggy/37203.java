private void getCoordinates() {
    if ((location) != null) {
        latitude = location.getLatitude();
        longitude = location.getLongitude();
        sharedPreferences.edit().putString("latitude", java.lang.String.valueOf(latitude)).putString("longitude", java.lang.String.valueOf(longitude)).apply();
    }else {
        android.util.Log.e(ca.uqac.florentinth.speakerauthentication.MenuActivity.TAG, "Couldn't get the location. Make sure location is enabled on the device.");
    }
}