public static boolean putMasterPublicKey(byte[] masterPubKey, android.app.Activity context) {
    android.util.Log.e(com.breadwallet.tools.security.KeyStoreManager.TAG, ("putMasterPublicKey: " + (java.util.Arrays.toString(masterPubKey))));
    return ((masterPubKey != null) && ((masterPubKey.length) != 0)) && (com.breadwallet.tools.security.KeyStoreManager.setData(context, masterPubKey, com.breadwallet.tools.security.KeyStoreManager.PUB_KEY_ALIAS, com.breadwallet.tools.security.KeyStoreManager.PUB_KEY_FILENAME, com.breadwallet.tools.security.KeyStoreManager.PUB_KEY_IV, 0, false));
}