@java.lang.Override
public void handleFree(final jd.plugins.DownloadLink downloadLink) throws java.lang.Exception, jd.plugins.PluginException {
    requestFileInformation(downloadLink);
    if ((DLLINK) == null) {
        throw new jd.plugins.PluginException(jd.plugins.LinkStatus.ERROR_PREMIUM, jd.plugins.PluginException.VALUE_ID_PREMIUM_ONLY);
    }
    doFree(downloadLink, jd.plugins.hoster.ParteeeyDe.FREE_RESUME, jd.plugins.hoster.ParteeeyDe.FREE_MAXCHUNKS, "free_directlink");
}