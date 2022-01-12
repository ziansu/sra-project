@java.lang.Override
public java.lang.Void call() throws java.lang.Exception {
    org.bitcoinj.wallet.Context.propagate(wallet.getContext());
    if (!(savePending.getAndSet(false))) {
        return null;
    }
    org.bitcoinj.wallet.WalletFiles.log.info("Background saving wallet, last seen block is {}/{}", wallet.getLastBlockSeenHeight(), wallet.getLastBlockSeenHash());
    saveNowInternal();
    return null;
}