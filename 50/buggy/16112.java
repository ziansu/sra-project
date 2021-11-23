public static android.security.KeyStore getInstance() {
    android.security.IKeystoreService keystore = IKeystoreService.Stub.asInterface(android.os.ServiceManager.getService("android.security.keystore"));
    return new android.security.KeyStore(keystore);
}