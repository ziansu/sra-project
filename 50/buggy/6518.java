@java.lang.Override
public void run() {
    mCryptoStore.setGlobalBlacklistUnverifiedDevices(block);
    if (null != callback) {
        callback.onSuccess(null);
    }
}