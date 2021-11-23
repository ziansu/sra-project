public static void changeConfigIniProperty(java.io.File configIniFile, java.lang.String propKey, java.lang.String value) {
    java.util.Properties prop = new java.util.Properties();
    try (java.io.InputStream inputStream = new java.io.FileInputStream(configIniFile);java.io.OutputStream outputStream = new java.io.FileOutputStream(configIniFile)) {
        prop.load(inputStream);
        prop.setProperty(propKey, value);
        prop.store(outputStream, null);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}