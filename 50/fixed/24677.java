public static long longValue(java.lang.Object input, long valueIfNull) {
    if ((input == null) || ("".equals(input))) {
        return valueIfNull;
    }
    return org.owasp.csrfguard.config.overlay.ConfigPropertiesCascadeCommonUtils.longObjectValue(input, false).longValue();
}