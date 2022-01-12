private java.util.Properties maybeRetrieveProperties() {
    java.util.Properties properties = new java.util.Properties();
    if (new java.io.File(playn.java.JavaStorage.tempFile).exists()) {
        try {
            properties.load(new java.io.FileInputStream(new java.io.File(playn.java.JavaStorage.tempDir, playn.java.JavaStorage.tempFile)));
            isPersisted = true;
        } catch (java.lang.Exception e) {
            playn.core.PlayN.log().info(("Error retrieving file: " + (e.getMessage())));
            isPersisted = false;
        }
    }else {
        maybePersistProperties(properties);
    }
    return properties;
}