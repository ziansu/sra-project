public boolean isConnected() {
    android.net.ConnectivityManager connectivityManager = ((android.net.ConnectivityManager) (this.getActivity().getSystemService(Context.CONNECTIVITY_SERVICE)));
    android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
    if (activeNetworkInfo != null)
        return activeNetworkInfo.isConnected();
    else
        return false;
    
}