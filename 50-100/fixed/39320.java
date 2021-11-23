private void saveNonSharedSettings() {
    sharedConfigMaster = org.sleuthkit.autopsy.experimental.configuration.AutoIngestUserPreferences.getSharedConfigMaster();
    sharedConfigFolder = org.sleuthkit.autopsy.experimental.configuration.AutoIngestUserPreferences.getSharedConfigFolder();
    displayLocalTime = org.sleuthkit.autopsy.core.UserPreferences.displayTimesInLocalTime();
    hideKnownFilesInDataSource = org.sleuthkit.autopsy.core.UserPreferences.hideKnownFilesInDataSourcesTree();
    hideKnownFilesInViews = org.sleuthkit.autopsy.core.UserPreferences.hideKnownFilesInViewsTree();
    keepPreferredViewer = org.sleuthkit.autopsy.core.UserPreferences.keepPreferredContentViewer();
    fileIngestThreads = org.sleuthkit.autopsy.core.UserPreferences.numberOfFileIngestThreads();
}