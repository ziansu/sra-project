public static boolean putMasterPublicKey(byte[] masterPubKey, android.app.Activity context) {
    return ((masterPubKey != null) && ((masterPubKey.length) != 0)) && (com.breadwallet.tools.security.KeyStoreManager.setData(context, masterPubKey, com.breadwallet.tools.security.KeyStoreManager.PUB_KEY_ALIAS, com.breadwallet.tools.security.KeyStoreManager.PUB_KEY_FILENAME, com.breadwallet.tools.security.KeyStoreManager.PUB_KEY_IV, 0, false));
}