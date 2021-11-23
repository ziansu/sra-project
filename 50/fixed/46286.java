private void sendWidgetBroadcast() {
    sendBroadcast(widgetIntent);
    if (timeArray.contains(simpleDateFormat.format(new java.util.Date(java.lang.System.currentTimeMillis())))) {
        requestWeatherData(true);
    }
}