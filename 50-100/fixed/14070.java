@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.i(com.polito.mad17.madmax.activities.login.LogInActivity.TAG, "link to signup clicked");
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.polito.mad17.madmax.activities.login.SignUpActivity.class);
    android.app.PendingIntent pendingIntent = android.support.v4.app.TaskStackBuilder.create(getApplicationContext()).addNextIntentWithParentStack(intent).getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT);
    android.support.v4.app.NotificationCompat.Builder builder = new android.support.v4.app.NotificationCompat.Builder(getApplicationContext());
    builder.setContentIntent(pendingIntent);
    startActivity(intent);
}