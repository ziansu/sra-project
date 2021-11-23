@java.lang.Override
public void run() {
    java.lang.String aaid = "";
    try {
        aaid = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(this).getId();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    com.aptoide.amethyst.utils.AptoideUtils.getSharedPreferences().edit().putString("advertisingIdClient", aaid).apply();
}