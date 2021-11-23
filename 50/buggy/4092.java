@java.lang.Override
public void onCreate() {
    super.onCreate();
    try {
        java.security.Security.insertProviderAt(new org.spongycastle.jce.provider.BouncyCastleProvider(), 1);
    } catch (java.lang.NoClassDefFoundError e) {
        android.util.Log.w(com.tananaev.passportreader.MainApplication.class.getSimpleName(), e);
    }
}