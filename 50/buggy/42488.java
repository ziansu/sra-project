public boolean hasInternetConnection(android.content.Context context) {
    return (!(isInAirplaneMode(context))) && (isNetworkAvailable(context));
}