private android.app.AlertDialog getNetworkErrorDialog(android.app.Activity activity, android.content.DialogInterface.OnClickListener createNetworkListener) {
    createNetworkErrorDialog(activity, createNetworkListener);
    return networkErrorDialog;
}