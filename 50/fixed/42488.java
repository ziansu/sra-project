public boolean hasInternetConnection(android.content.Context context) {
    if (context == null) {
        return true;
    }
    return (!(isInAirplaneMode(context))) && (isNetworkAvailable(context));
}