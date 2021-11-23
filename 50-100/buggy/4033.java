public com.m2049r.xmrwallet.model.Wallet createWalletFromKeys(java.io.File aFile, java.lang.String language, long restoreHeight, java.lang.String addressString, java.lang.String viewKeyString, java.lang.String spendKeyString) {
    long walletHandle = createWalletFromKeysJ(aFile.getAbsolutePath(), language, isTestNet(), restoreHeight, addressString, viewKeyString, spendKeyString);
    com.m2049r.xmrwallet.model.Wallet wallet = new com.m2049r.xmrwallet.model.Wallet(walletHandle);
    manageWallet(wallet.getName(), wallet);
    return wallet;
}