public static android.security.KeyStore getInstance() {
    android.security.IKeystoreService keystore = IKeystoreService.Stub.asInterface(android.os.ServiceManager.getService("android.security.keystore"));
    if (keystore == null) {
        return null;
    }
    return new android.security.KeyStore(keystore);
}