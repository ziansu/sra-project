@java.lang.Override
public void onDisabled(android.content.Context context) {
    super.onDisabled(context);
    com.ppyy.ppweatherplus.utils.L.e("WeatherHorizontalAppWidget onDisabled");
    com.ppyy.ppweatherplus.service.AppWidgetService.stopService();
}