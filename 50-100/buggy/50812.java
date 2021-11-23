public boolean isNetworkConnected(final android.content.Context context) {
    final android.net.ConnectivityManager connectivityManager = ((android.net.ConnectivityManager) (context.getSystemService(Context.CONNECTIVITY_SERVICE)));
    return ((connectivityManager.getActiveNetworkInfo()) != null) && (connectivityManager.getActiveNetworkInfo().isConnected());
}