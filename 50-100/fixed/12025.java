public void onClick(android.content.DialogInterface dialog, int which) {
    android.app.NotificationManager nm = ((android.app.NotificationManager) (getSystemService(getApplicationContext().NOTIFICATION_SERVICE)));
    nm.cancel(apier.com.lifttrak.RunWorkout.uniqueID);
    apier.com.lifttrak.DBHandler dbHandler = new apier.com.lifttrak.DBHandler(getApplicationContext(), null, null, 1);
    dbHandler.addCompleteWorkout(workoutSelected, exercises);
    android.content.Intent finishWorkout = new android.content.Intent(getApplicationContext(), apier.com.lifttrak.FinishWorkout.class);
    startActivity(finishWorkout);
    finish();
}