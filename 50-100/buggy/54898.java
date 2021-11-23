private void restoreNonSharedSettings() {
    org.sleuthkit.autopsy.experimental.configuration.AutoIngestUserPreferences.setSharedConfigFolder(sharedConfigFolder);
    org.sleuthkit.autopsy.experimental.configuration.AutoIngestUserPreferences.setSharedConfigMaster(sharedConfigMaster);
    org.sleuthkit.autopsy.experimental.configuration.AutoIngestUserPreferences.setMode(mode);
    org.sleuthkit.autopsy.core.UserPreferences.setDisplayTimesInLocalTime(displayLocalTime);
    org.sleuthkit.autopsy.core.UserPreferences.setHideKnownFilesInDataSourcesTree(hideKnownFilesInDataSource);
    org.sleuthkit.autopsy.core.UserPreferences.setHideKnownFilesInViewsTree(hideKnownFilesInViews);
    org.sleuthkit.autopsy.core.UserPreferences.setKeepPreferredContentViewer(keepPreferredViewer);
    org.sleuthkit.autopsy.core.UserPreferences.setNumberOfFileIngestThreads(fileIngestThreads);
}