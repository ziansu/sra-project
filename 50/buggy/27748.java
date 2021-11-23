@java.lang.Override
public void onCreate() {
    super.onCreate();
    mMobvoiApiClient = new com.mobvoi.android.common.api.MobvoiApiClient.Builder(this).addApi(Wearable.API).build();
    mMobvoiApiClient.connect();
}