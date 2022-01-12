@java.lang.Override
protected java.lang.String getToken() throws be.ugent.zeus.hydra.requests.exceptions.TokenException {
    if ((account) == null) {
        accountBundle = be.ugent.zeus.hydra.minerva.auth.AccountUtils.syncAuthCode(context);
    }else {
        accountBundle = be.ugent.zeus.hydra.minerva.auth.AccountUtils.syncAuthCode(context, account);
    }
    if (((accountBundle) == null) || (accountBundle.containsKey(AccountManager.KEY_INTENT))) {
        throw new be.ugent.zeus.hydra.requests.exceptions.TokenException();
    }else {
        return accountBundle.getString(AccountManager.KEY_AUTHTOKEN);
    }
}