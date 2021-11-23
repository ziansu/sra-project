protected void removePageLibTempFolder(final java.lang.String pageName) {
    final java.io.File libTempFolder = org.bonitasoft.console.common.server.page.CustomPageService.PAGES_LIB_DIRECTORIES.get(pageName);
    if (libTempFolder != null) {
        try {
            org.apache.commons.io.FileUtils.deleteDirectory(libTempFolder);
        } catch (final java.io.IOException e) {
            if (org.bonitasoft.console.common.server.page.CustomPageService.LOGGER.isLoggable(java.util.logging.Level.WARNING)) {
                org.bonitasoft.console.common.server.page.CustomPageService.LOGGER.log(java.util.logging.Level.WARNING, (("The custom page temporary lib directory " + (libTempFolder.getPath())) + " cannot be deleted. This is likely to be due to a JDK bug on Windows. You can safely delete it after a server restart."));
            }
        }
    }
}