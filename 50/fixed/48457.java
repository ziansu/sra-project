@java.lang.Override
public void handleFree(final jd.plugins.DownloadLink downloadLink) throws java.lang.Exception, jd.plugins.PluginException {
    requestFileInformation(downloadLink);
    throw new jd.plugins.PluginException(jd.plugins.LinkStatus.ERROR_PREMIUM, jd.plugins.PluginException.VALUE_ID_PREMIUM_ONLY);
}