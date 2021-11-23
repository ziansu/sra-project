private static void setProperty(final org.slf4j.Logger logger, final java.lang.String key, final java.lang.String value) {
    java.lang.System.setProperty(key, java.lang.System.getProperty(key, value));
}