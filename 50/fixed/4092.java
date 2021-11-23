@java.lang.Override
public void onCreate() {
    super.onCreate();
    java.security.Security.insertProviderAt(new org.spongycastle.jce.provider.BouncyCastleProvider(), 1);
}