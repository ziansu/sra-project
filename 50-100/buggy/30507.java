public void store() {
    java.util.Properties p = new java.util.Properties();
    p.setProperty("nodeId", nodeId);
    p.setProperty("executionState", executionState.toString());
    try {
        java.io.OutputStream propertiesStream = java.nio.file.Files.newOutputStream(propertiesPath);
        p.store(propertiesStream, "jar path properties");
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException(e);
    }
}