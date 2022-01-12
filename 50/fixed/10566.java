@java.lang.Override
protected void initializeLibraryDependencies() {
    if (!(org.chromium.base.BuildInfo.hasLanguageApkSplits(this))) {
        org.chromium.base.ResourceExtractor.setResourcesToExtract(org.chromium.ui.base.ResourceBundle.getActiveLocaleResources());
    }
    org.chromium.base.PathUtils.setPrivateDataDirectorySuffix(org.chromium.chrome.browser.ChromeApplication.PRIVATE_DATA_DIRECTORY_SUFFIX, this);
}