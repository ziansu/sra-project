@java.lang.Override
public java.lang.String getDownloadURL() {
    com.liferay.portal.kernel.plugin.RemotePluginPackageRepository remotePluginPackageRepository = getRepository();
    if (remotePluginPackageRepository != null) {
        java.util.Properties settings = remotePluginPackageRepository.getSettings();
        java.lang.String useDownloadURL = settings.getProperty(RemotePluginPackageRepository.SETTING_USE_DOWNLOAD_URL);
        if (!(com.liferay.portal.kernel.util.GetterUtil.getBoolean(useDownloadURL, true))) {
            return getArtifactURL();
        }
    }
    if (com.liferay.portal.kernel.util.Validator.isNotNull(_downloadURL)) {
        return _downloadURL;
    }
    return getArtifactURL();
}