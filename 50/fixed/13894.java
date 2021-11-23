public static boolean isInternetAvailable(android.content.Context context) {
    android.net.ConnectivityManager service = ((android.net.ConnectivityManager) (context.getSystemService(Context.CONNECTIVITY_SERVICE)));
    android.net.NetworkInfo info = service.getActiveNetworkInfo();
    return !(info == null);
}