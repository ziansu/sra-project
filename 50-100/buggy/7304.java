public void handlePremiumAPI(final jd.plugins.DownloadLink downloadLink, final jd.plugins.Account account) throws java.lang.Exception, jd.plugins.PluginException {
    loginAPI(account);
    if ((account.getType()) == (jd.plugins.Account.AccountType.FREE)) {
        handleDownloadAPI(downloadLink, true, 0, false, "directlink_freeaccount");
    }else {
        handleDownloadAPI(downloadLink, true, (-4), true, "directlink_premiumaccount");
    }
}