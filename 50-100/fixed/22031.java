public float getDimensionValueRaw(java.lang.String key, float defaultValue) {
    java.lang.String value = getString(key);
    if (value == null) {
        return defaultValue;
    }
    java.util.regex.Matcher matcher = com.actinarium.rhythm.config.LayerConfig.DIMEN_VALUE_PATTERN.matcher(value);
    if (matcher.find()) {
        return java.lang.Float.parseFloat(matcher.group());
    }else {
        return defaultValue;
    }
}