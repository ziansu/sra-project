private static java.util.Properties loadProperties(java.io.File file) {
    final java.util.Properties properties = new java.util.Properties();
    java.io.FileInputStream fis = null;
    try {
        fis = new java.io.FileInputStream(file);
        properties.load(fis);
    } catch (final java.io.IOException ex) {
        java.lang.System.out.println(("Unable to load properties from file: " + (file.getAbsolutePath())));
        ex.printStackTrace(java.lang.System.out);
        java.lang.System.exit(1);
    } finally {
        com.puppycrawl.tools.checkstyle.api.Utils.closeQuietly(fis);
    }
    return properties;
}