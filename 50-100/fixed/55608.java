@java.lang.Override
public void handleFree(final jd.plugins.DownloadLink downloadLink) throws java.lang.Exception, jd.plugins.PluginException {
    requestFileInformation(downloadLink);
    if ((jd.plugins.hoster.FilesUploadOrg.AVAILABLE_CHECK_OVER_INFO_PAGE) && (!(isNewLinkType(downloadLink)))) {
        getPage(downloadLink.getDownloadURL());
    }
    doFree(downloadLink, "free_directlink", jd.plugins.hoster.FilesUploadOrg.FREE_RESUME, jd.plugins.hoster.FilesUploadOrg.FREE_MAXCHUNKS);
}