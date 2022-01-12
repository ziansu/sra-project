public static java.util.Properties loadPropertiesFile(java.lang.String filename) {
    java.util.Properties properties = new java.util.Properties();
    java.io.InputStream in;
    in = com.xdrop.passlock.PassLock.class.getClassLoader().getResourceAsStream(filename);
    try {
        properties.load(in);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return properties;
}