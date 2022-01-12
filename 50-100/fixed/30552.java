public static boolean isNetworkConnected(android.content.Context context) {
    android.net.ConnectivityManager connectivityManager = ((android.net.ConnectivityManager) (context.getSystemService(Context.CONNECTIVITY_SERVICE)));
    android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
    return (activeNetworkInfo != null) && (activeNetworkInfo.isConnected());
}