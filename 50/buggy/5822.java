public boolean isInternetAvailable() {
    return (isNetworkAvailable()) && (isOnline());
}