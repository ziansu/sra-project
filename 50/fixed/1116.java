public static void initialize(android.content.Context c) {
    com.adsamcik.signalcollector.Extensions.telephonyManager = ((android.telephony.TelephonyManager) (c.getSystemService(Context.TELEPHONY_SERVICE)));
    com.adsamcik.signalcollector.Extensions.connectivityManager = ((android.net.ConnectivityManager) (c.getSystemService(Context.CONNECTIVITY_SERVICE)));
}