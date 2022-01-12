public static boolean isInternetAvailable(android.content.Context context) {
    android.net.NetworkInfo info = ((android.net.NetworkInfo) (((android.net.ConnectivityManager) (context.getSystemService(Context.CONNECTIVITY_SERVICE))).getActiveNetworkInfo()));
    if (info == null) {
        android.util.Log.d(com.example.rossmaguire.beacontest.LoginActivity.TAG, "no internet connection");
        return false;
    }else {
        if (info.isConnected()) {
            android.util.Log.d(com.example.rossmaguire.beacontest.LoginActivity.TAG, " internet connection available...");
            return true;
        }else {
            android.util.Log.d(com.example.rossmaguire.beacontest.LoginActivity.TAG, " internet connection");
            return true;
        }
    }
}