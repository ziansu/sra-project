@java.lang.Override
public void migrate(java.lang.String newRootPath) {
    java.io.File fromDir = new java.io.File(contentRootPath);
    java.io.File toDir = new java.io.File(newRootPath);
    try {
        copyDirectory(fromDir, toDir);
        mainLocalStorage.migrate((newRootPath + "/content-manager/storage"));
        addMigrationHistoryItem(contentRootPath, newRootPath);
        contentRootPath = newRootPath;
    } catch (java.io.IOException e) {
        org.fruct.oss.mapcontent.content.ContentManagerImpl.log.error("Can't migrate data directory");
        deleteDir(toDir, org.fruct.oss.mapcontent.content.ContentManagerImpl.SAFEGUARD_STRING);
    }
}