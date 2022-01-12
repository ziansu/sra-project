@java.lang.Override
public void onUpdate(android.content.Context context, android.appwidget.AppWidgetManager appWidgetManager, int[] appWidgetIds) {
    final int N = appWidgetIds.length;
    mContext = context;
    for (int i = 0; i < N; i++) {
        int appWidgetId = appWidgetIds[i];
        android.widget.RemoteViews remoteViews = new android.widget.RemoteViews(context.getPackageName(), R.layout.btc_price_widget);
        com.gmail.halfik.btcprice.widget.BtcPriceWidget.updateAppWidget(context, appWidgetManager, appWidgetId);
        appWidgetManager.updateAppWidget(appWidgetId, remoteViews);
    }
    com.gmail.halfik.btcprice.service.PollService.setServiceAlarm(context, true);
}