public static java.util.Properties getProperties(java.io.File propertiesFile) {
    java.util.Properties properties = new java.util.Properties();
    try {
        java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader(propertiesFile));
        properties.load(reader);
        reader.close();
    } catch (java.io.IOException e) {
        kr.jm.utils.exception.JMExceptionManager.logException(log, e, "getProperties", propertiesFile);
    }
    return properties;
}