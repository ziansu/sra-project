@java.lang.Override
public void onCreate() {
    super.onCreate();
    org.acra.ACRA.init(this);
    ir.mbaas.pushnotification.CustomGcmListener customGcmListener = new ir.mbaas.pushnotification.CustomGcmListener();
    ir.mbaas.pushnotification.CustomMBaaSListener customMBaaSListener = new ir.mbaas.pushnotification.CustomMBaaSListener();
    ir.mbaas.sdk.MBaaS.init(this, null, null, null, false);
}