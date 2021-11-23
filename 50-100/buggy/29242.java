public static ir.mbaas.sdk.models.DeviceInfo getDeviceInfo(android.content.Context ctx) {
    android.telephony.TelephonyManager tm = ((android.telephony.TelephonyManager) (ctx.getSystemService(Context.TELEPHONY_SERVICE)));
    java.lang.String IMEI = ir.mbaas.sdk.helper.StaticMethods.getUniqueID(ctx, tm);
    java.lang.String deviceName = android.os.Build.MODEL;
    java.lang.String brand = android.os.Build.BRAND;
    java.lang.String osVersion = android.os.Build.VERSION.RELEASE;
    int sdkVersion = android.os.Build.VERSION.SDK_INT;
    int userId = 0;
    return new ir.mbaas.sdk.models.DeviceInfo(IMEI, deviceName, brand, osVersion, sdkVersion, userId);
}