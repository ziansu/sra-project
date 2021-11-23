public void setAltitudePreference(java.lang.String prefKey, int altitude) {
    prefs.edit().putString(prefKey, java.lang.String.valueOf(altitude)).apply();
}