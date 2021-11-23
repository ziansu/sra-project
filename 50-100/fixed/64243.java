private void setCurrentHour(com.photbit.weatherse.domain.sun.SunTime sunTime) {
    int sunOrMoon = (sunTime.isSunUp(java.util.Calendar.getInstance())) ? R.drawable.image_clear_d : R.drawable.image_clear_n;
    remoteViews.setImageViewResource(R.id.widget_current_sun, sunOrMoon);
    remoteViews.setTextViewText(R.id.widget_sunrise, sunTime.getSunrise());
    remoteViews.setTextViewText(R.id.widget_sunset, sunTime.getSunset());
    remoteViews.setTextViewText(R.id.widget_suntime, sunTime.getTimeToSunset(java.util.Calendar.getInstance()));
}