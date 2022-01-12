@java.lang.Override
public void onAppWidgetOptionsChanged(android.content.Context context, android.appwidget.AppWidgetManager appWidgetManager, int appWidgetId, android.os.Bundle newOptions) {
    android.os.Bundle options = appWidgetManager.getAppWidgetOptions(appWidgetId);
    int minWidth = options.getInt(AppWidgetManager.OPTION_APPWIDGET_MIN_WIDTH);
    int minHeight = options.getInt(AppWidgetManager.OPTION_APPWIDGET_MIN_HEIGHT);
    appWidgetManager.updateAppWidget(appWidgetId, getRemoteView(context, appWidgetManager, appWidgetId, new com.zhun.sununtouch.smart_sunrise.Configuration.AlarmConfigurationList(context)));
    super.onAppWidgetOptionsChanged(context, appWidgetManager, appWidgetId, newOptions);
}