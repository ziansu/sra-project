private void maybePersistProperties(java.util.Properties properties) {
    try {
        properties.store(new java.io.FileOutputStream(new java.io.File(playn.java.JavaStorage.tempDir, playn.java.JavaStorage.tempFile)), null);
        isPersisted = true;
    } catch (java.lang.Exception e) {
        playn.core.PlayN.log().info(("Error persisting properties: " + (e.getMessage())));
        isPersisted = false;
    }
}