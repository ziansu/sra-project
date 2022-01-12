public com.m2049r.xmrwallet.model.Wallet createWallet(java.io.File aFile, java.lang.String password, java.lang.String language) {
    long walletHandle = createWalletJ(aFile.getAbsolutePath(), password, language, isTestNet());
    com.m2049r.xmrwallet.model.Wallet wallet = new com.m2049r.xmrwallet.model.Wallet(walletHandle);
    manageWallet(wallet);
    return wallet;
}