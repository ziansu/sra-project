public com.m2049r.xmrwallet.model.Wallet recoveryWallet(java.io.File aFile, java.lang.String mnemonic, long restoreHeight) {
    long walletHandle = recoveryWalletJ(aFile.getAbsolutePath(), mnemonic, isTestNet(), restoreHeight);
    com.m2049r.xmrwallet.model.Wallet wallet = new com.m2049r.xmrwallet.model.Wallet(walletHandle);
    manageWallet(wallet);
    return wallet;
}