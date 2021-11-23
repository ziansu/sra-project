private android.app.AlertDialog getAutoCheckinDialog(android.app.Activity activity, android.content.DialogInterface... checkinListeners) {
    if ((autoCheckinDialog) == null) {
        createAutoCheckinAlertDialog(activity, checkinListeners);
    }
    return autoCheckinDialog;
}