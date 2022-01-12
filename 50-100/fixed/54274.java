@java.lang.Override
public void run() {
    try {
        log.info(("Process ended; cleaning up " + (extractDir.getAbsolutePath())));
        org.apache.commons.io.FileUtils.deleteDirectory(extractDir);
    } catch (java.io.IOException e) {
        log.log(java.util.logging.Level.WARNING, ("Failed to clean up " + (extractDir.getAbsolutePath())), e);
    }
    instancesModel.update(true);
}