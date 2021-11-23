public static java.lang.String getStringEnv(java.lang.String envVarName, java.lang.String defaultValue) {
    try {
        java.lang.String s = java.lang.System.getenv(envVarName);
        return s != null ? s : defaultValue;
    } catch (java.lang.Exception ex) {
        return defaultValue;
    }
}