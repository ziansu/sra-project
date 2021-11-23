public void onClick(android.content.DialogInterface dialog, int which) {
    try {
        SendIMEI();
    } catch (java.lang.Exception e) {
        SendIMEIFailedDialog().show();
    }
    dialog.cancel();
}