public static int intValue(java.lang.Object input, int valueIfNull) {
    if ((input == null) || ("".equals(input))) {
        return valueIfNull;
    }
    return org.owasp.csrfguard.config.overlay.ConfigPropertiesCascadeCommonUtils.intObjectValue(input, false).intValue();
}