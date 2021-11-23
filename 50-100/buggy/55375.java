public com.kondenko.yamblzweather.domain.entity.TempUnit getUnitKey() {
    java.lang.String unitKey = context.getString(R.string.pref_key_temp_unit);
    java.lang.String defaultUnit = context.getString(R.string.pref_key_unit_kelvin);
    java.lang.String unit = preferences.getString(unitKey, defaultUnit);
    if (unit.equals(context.getString(R.string.pref_key_unit_fahrenheit)))
        return com.kondenko.yamblzweather.domain.entity.TempUnit.IMPERIAL;
    
    if (unit.equals(context.getString(R.string.pref_key_unit_celsius)))
        return com.kondenko.yamblzweather.domain.entity.TempUnit.METRIC;
    
    if (unit.equals(context.getString(R.string.pref_key_unit_kelvin)))
        return com.kondenko.yamblzweather.domain.entity.TempUnit.SCIENTIFIC;
    
    throw new java.lang.IllegalArgumentException("Wrong temperature unit");
}