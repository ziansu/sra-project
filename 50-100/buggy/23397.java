@java.lang.Override
public void onCreate() {
    super.onCreate();
    org.eson.liteble.MyApplication.mContext = this;
    org.eson.liteble.MyApplication.instance = this;
    com.e.ble.BLESdk.get().init(org.eson.liteble.MyApplication.mContext);
    com.e.ble.BLESdk.get().setMaxConnect(3);
    configShare = new org.eson.liteble.share.ConfigShare(org.eson.liteble.MyApplication.mContext);
    com.e.ble.BLESdk.get().setPermitConnectMore(configShare.isPermitConnectMore());
    android.content.Intent bleServer = new android.content.Intent(org.eson.liteble.MyApplication.mContext, org.eson.liteble.service.BleService.class);
    startService(bleServer);
}