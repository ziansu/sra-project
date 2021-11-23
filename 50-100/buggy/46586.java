@java.lang.Override
protected void onMissedCall(android.content.Context ctx, java.lang.String number, java.util.Date start) {
    android.content.SharedPreferences sharedPref = ctx.getSharedPreferences("general_settings", Context.MODE_PRIVATE);
    java.lang.String message = sharedPref.getString("sms_message", ctx.getResources().getString(R.string.default_sms_message));
    android.util.Log.d("sms_track_e", "On missed call");
    com.youmissed.receivers.NotificationHandler.getInstance(ctx).createProgressNotification(ctx, number, message, start);
    android.util.Log.d("contact_number", number);
}