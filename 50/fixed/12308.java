@org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
public void onMessageEvent(com.joe.holi.data.event.MessageEvent.WidgetCity widgetCity) {
    cityRequest = widgetCity.cityName;
    widgetIntent.putExtra(WidgetConstants.WIDGET_CURRENT_CITY, cityRequest);
    requestWeatherData(false);
}