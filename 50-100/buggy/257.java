@java.lang.Override
public void cleanup() {
    propertiesFile.delete();
    if ((listenerComms) != null) {
        listenerComms.close();
        listenerComms = null;
    }
    prepared = false;
    aQute.launcher.plugin.ProjectLauncherImpl.logger.debug("Deleted {}", propertiesFile.getAbsolutePath());
}