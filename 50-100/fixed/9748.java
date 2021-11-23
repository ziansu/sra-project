@java.lang.Override
protected void onPreExecute() {
    android.net.ConnectivityManager cm = ((android.net.ConnectivityManager) (mContext.getSystemService(Context.CONNECTIVITY_SERVICE)));
    android.net.NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
    boolean isConnected = (activeNetwork != null) && (activeNetwork.isConnectedOrConnecting());
    if (isConnected) {
        showProgressDialogue();
    }else {
        android.widget.Toast.makeText(mContext, mContext.getString(R.string.toast_no_internet_connection), Toast.LENGTH_SHORT).show();
    }
}