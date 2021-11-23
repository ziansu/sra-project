@java.lang.Override
public void onLoadFinished(android.content.Loader<java.util.List<ahmadadam96.comicbookmovies.Movie>> loader, java.util.List<ahmadadam96.comicbookmovies.Movie> movies) {
    android.net.ConnectivityManager connMGR = ((android.net.ConnectivityManager) (getSystemService(Context.CONNECTIVITY_SERVICE)));
    android.net.NetworkInfo activeNetwork = connMGR.getActiveNetworkInfo();
    boolean isConnected = (activeNetwork != null) && (activeNetwork.isConnectedOrConnecting());
    int current = movies.size();
    android.util.Log.e(ahmadadam96.comicbookmovies.MainActivity.TAG, ("" + current));
}