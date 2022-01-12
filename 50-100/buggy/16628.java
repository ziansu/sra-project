@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.net.ConnectivityManager connectivityManager = ((android.net.ConnectivityManager) (getSystemService(Context.CONNECTIVITY_SERVICE)));
    if (connectivityManager.getActiveNetworkInfo().isConnected()) {
        connectStatus.setText("Connected");
        doAllTheWork();
    }else {
        connectStatus.setText(R.string.cstep11);
    }
}