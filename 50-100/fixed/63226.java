public boolean isOnline(android.content.Context context) {
    android.net.ConnectivityManager cm = ((android.net.ConnectivityManager) (context.getSystemService(Context.CONNECTIVITY_SERVICE)));
    android.net.NetworkInfo netInfo = cm.getActiveNetworkInfo();
    if ((netInfo != null) && (netInfo.isConnectedOrConnecting())) {
        return true;
    }
    intent = new android.content.Intent(this, com.app.scope.myapplication.LoginActivity.class);
    startActivity(intent);
    return false;
}