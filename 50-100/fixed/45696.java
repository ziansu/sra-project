private double getAltitudePreference(java.lang.String prefKey, double defaultValue) {
    final java.lang.String maxAltValue = prefs.getString(prefKey, null);
    if (android.text.TextUtils.isEmpty(maxAltValue))
        return defaultValue;
    
    try {
        final double maxAlt = java.lang.Double.parseDouble(maxAltValue.trim());
        return maxAlt;
    } catch (java.lang.Exception e) {
        return defaultValue;
    }
}