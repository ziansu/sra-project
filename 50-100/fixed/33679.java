public static android.app.PendingIntent createOpenAppPendingIntent(android.content.Context context, java.lang.String quote) {
    android.content.Intent openAppIntent = new android.content.Intent(context, com.ojdudu.bepresent.ui.QuotesMainView.class);
    openAppIntent.putExtra(context.getString(R.string.open_app_intent_quote_extra), quote);
    android.support.v4.app.TaskStackBuilder stackBuilder = android.support.v4.app.TaskStackBuilder.create(context);
    stackBuilder.addParentStack(com.ojdudu.bepresent.ui.QuotesMainView.class);
    stackBuilder.addNextIntent(openAppIntent);
    return stackBuilder.getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT);
}