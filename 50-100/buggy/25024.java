public org.fhaes.enums.SampleDepthFilterType getSampleDepthFilterTypePref(org.fhaes.preferences.FHAESPreferences.PrefKey key, org.fhaes.enums.SampleDepthFilterType defaultValue) {
    java.lang.String value = "";
    if (defaultValue == null) {
        value = org.fhaes.preferences.FHAESPreferences.prefs.get(key.getValue(), null);
    }else {
        value = org.fhaes.preferences.FHAESPreferences.prefs.get(key.getValue(), defaultValue.name());
    }
    if (value == null)
        return defaultValue;
    
    if ((org.fhaes.enums.FireFilterType.fromName(value)) == null)
        return defaultValue;
    
    return org.fhaes.enums.SampleDepthFilterType.fromName(value);
}