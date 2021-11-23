public static java.lang.String getDatabaseFilePath() {
    assertNotNull(java.lang.System.getProperty(AppOptions.DB_FILE_PREFIX));
    assertNotNull(java.lang.System.getProperty(AppOptions.DB_FILE_SUFFIX));
    return (java.lang.System.getProperty(AppOptions.DB_FILE_PREFIX)) + (java.lang.System.getProperty(AppOptions.DB_FILE_SUFFIX));
}