@java.lang.SuppressWarnings(value = "deprecation")
@java.lang.Override
public jd.plugins.AccountInfo fetchAccountInfo(final jd.plugins.Account account) throws java.lang.Exception {
    final jd.plugins.AccountInfo ai = new jd.plugins.AccountInfo();
    try {
        logger.info("Logging in without cookies (forced login)...");
        jd.plugins.hoster.VKontakteRuHoster.login(br, account);
        logger.info("Logged in successfully without cookies (forced login)!");
    } catch (final jd.plugins.PluginException e) {
        logger.info("Login failed!");
        account.setValid(false);
        throw e;
    }
    ai.setUnlimitedTraffic();
    ai.setStatus("Free Account");
    return ai;
}