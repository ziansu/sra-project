public void onClick(android.content.DialogInterface dialog, int which) {
    android.app.NotificationManager nm = ((android.app.NotificationManager) (getSystemService(getApplicationContext().NOTIFICATION_SERVICE)));
    nm.cancel(apier.com.lifttrak.RunWorkout.uniqueID);
    dialog.dismiss();
    finish();
}