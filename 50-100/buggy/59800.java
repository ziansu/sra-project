private static synchronized java.lang.String createNewHdWalletSeed(java.lang.String password) {
    java.lang.String seedString = com.ziftr.android.ziftrwallet.ZWPreferences.getHdWalletSeed();
    if (seedString == null) {
        byte[] seed = new byte[32];
        com.ziftr.android.ziftrwallet.sqlite.ZWWalletManager.getSecureRandom().nextBytes(seed);
        com.ziftr.android.ziftrwallet.crypto.ZWKeyCrypter crypter = com.ziftr.android.ziftrwallet.sqlite.ZWWalletManager.passwordToCrypter(password);
        com.ziftr.android.ziftrwallet.ZWPreferences.setHdWalletSeed(crypter.encrypt(com.ziftr.android.ziftrwallet.util.ZiftrUtils.bytesToHexString(seed)).toString());
    }
    return seedString;
}