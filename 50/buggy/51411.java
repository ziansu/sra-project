private static android.app.PendingIntent getAlarmIntent(android.content.Context context) {
    android.content.Intent intent = new android.content.Intent(context, com.voidgreen.privatcurrency.widget.CurrencyWidgetProvider.class);
    intent.setAction(Constants.ACTION_UPDATE);
    android.app.PendingIntent pi = android.app.PendingIntent.getBroadcast(context, 0, intent, 0);
    return pi;
}