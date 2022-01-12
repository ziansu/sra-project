public com.m2049r.xmrwallet.model.Wallet recoveryWallet(java.io.File aFile, java.lang.String mnemonic) {
    com.m2049r.xmrwallet.model.Wallet wallet = recoveryWallet(aFile, mnemonic, 0);
    manageWallet(wallet);
    return wallet;
}