@java.lang.Override
public final void onCreate() {
    android.util.Log.d(org.fraunhofer.cese.madcap.services.OnBootService.TAG, "onCreate Boot Service");
    android.content.Intent intent = new android.content.Intent(this, org.fraunhofer.cese.madcap.services.LoginService.class);
    startService(intent);
    this.stopSelf();
}