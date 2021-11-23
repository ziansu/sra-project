public static void cleanup(boolean deleteTemporary) {
    if ((deleteTemporary && ((org.owasp.dependencycheck.utils.Settings.tempDirectory) != null)) && (org.owasp.dependencycheck.utils.Settings.tempDirectory.exists())) {
        org.owasp.dependencycheck.utils.FileUtils.delete(org.owasp.dependencycheck.utils.Settings.tempDirectory);
    }
    try {
        org.owasp.dependencycheck.utils.Settings.localSettings.remove();
    } catch (java.lang.Throwable ex) {
        org.owasp.dependencycheck.utils.Settings.LOGGER.log(java.util.logging.Level.FINE, "Error cleaning up Settings", ex);
    }
}