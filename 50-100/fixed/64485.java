public void updateWeather() {
    android.net.ConnectivityManager manager = ((android.net.ConnectivityManager) (getActivity().getSystemService(Context.CONNECTIVITY_SERVICE)));
    android.net.NetworkInfo networkInfo = manager.getActiveNetworkInfo();
    if ((networkInfo != null) && (networkInfo.isConnected())) {
        com.example.android.sunshine.app.sync.SunshineSyncAdapter.syncImmediately(getActivity());
    }else {
        android.util.Log.e(com.example.android.sunshine.app.ForecastFragment.TAG, "Can't connect to the internet");
    }
}