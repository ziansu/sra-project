private android.app.AlertDialog getInfoAlertDialog(android.app.Activity activity) {
    if ((infoDialog) == null) {
        createInfoAlertDialog(activity);
    }
    return infoDialog;
}