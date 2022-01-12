public void setAltitudePreference(java.lang.String prefKey, double altitude) {
    prefs.edit().putString(prefKey, java.lang.String.valueOf(altitude)).apply();
}