@java.lang.Override
public void onConnectionChange(final boolean isConnected) {
    com.quickblox.q_municate_core.utils.QBConnectivityManager.isConnectivityExists = isConnected;
    notifyAllConnectivityListeners();
    android.util.Log.d("Fixes CONNECTIVITY", "onConnectionChange in QBConnectivityManager");
    android.util.Log.d("Fixes CONNECTIVITY", ("Connection is " + isConnected));
    if (isConnected) {
        com.quickblox.q_municate_core.qb.commands.QBReloginCommand.start(context);
    }else {
        android.widget.Toast.makeText(context, context.getString(R.string.connection_lost), Toast.LENGTH_LONG).show();
    }
}