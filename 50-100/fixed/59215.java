private void createLocalSharedFolder(com.databasepreservation.modules.siard.common.SIARDArchiveContainer container) {
    java.nio.file.Path containerPath = container.getPath();
    java.nio.file.Path localShared = java.nio.file.Paths.get("Schemas/localShared");
    java.io.File folder = containerPath.resolve(localShared).toFile();
    try {
        folder.mkdirs();
    } catch (java.lang.SecurityException e) {
        e.printStackTrace();
    }
}