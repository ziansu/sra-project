@java.lang.Override
public void onEnabled(android.content.Context context) {
    super.onEnabled(context);
    com.ppyy.ppweatherplus.appwidgets.WeatherVerticalAppWidget.sAppWidgetAvailable = true;
    com.ppyy.ppweatherplus.utils.L.e("WeatherVerticalAppWidget onEnable");
    com.ppyy.ppweatherplus.service.AppWidgetService.sShouldStopService = false;
    com.ppyy.ppweatherplus.service.AppWidgetService.sUpdateAppWidget = true;
    com.xdandroid.hellodaemon.DaemonEnv.startServiceMayBind(com.ppyy.ppweatherplus.service.AppWidgetService.class);
}