public static void loadProperties(java.lang.String file) {
    java.io.InputStream inputStream = resources.ResourceLoader.class.getClassLoader().getResourceAsStream(file);
    java.util.Properties config = new java.util.Properties();
    try {
        config.load(inputStream);
    } catch (java.io.IOException exc) {
        exc.printStackTrace();
    }
}