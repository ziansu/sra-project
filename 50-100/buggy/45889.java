@java.lang.Override
public void handleFree(final jd.plugins.DownloadLink link) throws java.lang.Exception, jd.plugins.PluginException {
    showMessage(link, "Task 1: Check URL validity!");
    final jd.plugins.DownloadLink.AvailableStatus status = requestFileInformation(link);
    if (AvailableStatus.UNCHECKABLE.equals(status)) {
        throw new jd.plugins.PluginException(jd.plugins.LinkStatus.ERROR_TEMPORARILY_UNAVAILABLE, (60 * 1000L));
    }
    showMessage(link, "Task 2: Download begins!");
    handleDL(account, link, link.getPluginPatternMatcher(), null);
}