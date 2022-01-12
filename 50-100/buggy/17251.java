public void init() {
    java.io.InputStream inputStream = getClass().getClassLoader().getResourceAsStream(Strings.PROPERTIES_FILE_NAME);
    java.util.Properties properties = new java.util.Properties();
    if (inputStream != null) {
        try {
            properties.load(inputStream);
        } catch (java.io.IOException e) {
            java.lang.System.err.println("Failed to open properties file.");
            propertiesFailed = true;
        }
        try {
            inputStream.close();
        } catch (java.io.IOException e) {
            java.lang.System.err.println("Failed to close properties file.");
            propertiesFailed = true;
        }
    }
}