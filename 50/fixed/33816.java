@java.lang.Override
public void handlePremium(final jd.plugins.DownloadLink link, final jd.plugins.Account account) throws java.lang.Exception {
    this.requestFileInformation(link, account, true);
    this.doFree(link);
}