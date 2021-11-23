@java.lang.Override
public java.lang.String getProperty(java.lang.String key, java.lang.String defaultValue) {
    java.lang.String val = null;
    try {
        val = java.lang.System.getenv(key);
        if ((val == null) || ((val.length()) == 0)) {
            val = java.util.Optional.ofNullable(java.lang.System.getProperty(key)).orElse(defaultValue);
        }
    } catch (java.lang.Exception e) {
        com.netflix.conductor.server.ConductorConfig.logger.error(e.getMessage(), e);
    }
    return val;
}