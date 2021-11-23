private static void loadSettings() {
    try {
        edu.flash3388.flashlib.util.ConstantsHandler.loadConstantsFromXml(edu.flash3388.flashlib.dashboard.Dashboard.SETTINGS_FILE);
        edu.flash3388.flashlib.dashboard.Remote.loadHosts(edu.flash3388.flashlib.dashboard.Dashboard.REMOTE_HOSTS_FILE);
    } catch (java.lang.Exception e) {
        edu.flash3388.flashlib.dashboard.Dashboard.log.reportError(e.getMessage());
    }
}