@java.lang.SuppressWarnings(value = "deprecation")
@java.lang.Override
public jd.plugins.AccountInfo fetchAccountInfo(final jd.plugins.Account account) throws java.lang.Exception {
    final jd.plugins.AccountInfo ai = new jd.plugins.AccountInfo();
    try {
        login(account, true);
    } catch (jd.plugins.PluginException e) {
        account.setValid(false);
        throw e;
    }
    ai.setUnlimitedTraffic();
    account.setType(AccountType.FREE);
    ai.setStatus("Registered (free) user");
    account.setValid(true);
    return ai;
}