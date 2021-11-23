public static boolean isSplunkEnabled() {
    try {
        return org.apache.commons.lang3.BooleanUtils.toBoolean(com.github.onsdigital.zebedee.Configuration.SplunkConfiguration.getValue(com.github.onsdigital.zebedee.Configuration.SplunkConfiguration.SPLUNK_ENABLED_ENV));
    } catch (java.lang.Exception ex) {
        return false;
    }
}