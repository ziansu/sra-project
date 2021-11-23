@java.lang.Override
public void run() {
    mAccountList = new java.util.ArrayList<>();
    refreshAccountsCacheFromDaemon();
    if (!(mAccountList.isEmpty())) {
        setCurrentAccount(mAccountList.get(0));
    }
    setAccountsActive(isConnected);
    cx.ring.daemon.Ringservice.connectivityChanged();
}