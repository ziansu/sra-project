private static boolean h2DataFileExists() throws java.io.IOException {
    final java.io.File dir = org.owasp.dependencycheck.utils.Settings.getDataDirectory();
    java.lang.String name = org.owasp.dependencycheck.utils.Settings.getString(Settings.KEYS.DB_FILE_NAME);
    final java.lang.String fileName = java.lang.String.format(name, org.owasp.dependencycheck.data.nvdcve.ConnectionFactory.DB_SCHEMA_VERSION);
    final java.io.File file = new java.io.File(dir, name);
    return file.exists();
}