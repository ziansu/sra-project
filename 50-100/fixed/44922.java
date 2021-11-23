@java.lang.Override
public void onAppWidgetOptionsChanged(android.content.Context context, android.appwidget.AppWidgetManager appWidgetManager, int appWidgetId, android.os.Bundle newOptions) {
    appWidgetManager.updateAppWidget(appWidgetId, getRemoteView(context, appWidgetManager, appWidgetId, new com.zhun.sununtouch.smart_sunrise.Configuration.AlarmConfigurationList(context)));
    super.onAppWidgetOptionsChanged(context, appWidgetManager, appWidgetId, newOptions);
}