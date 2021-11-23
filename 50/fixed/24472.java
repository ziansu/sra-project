public void setWeather(net.heatherandkevin.motowatchface.domain.WatchFaceWeather weather) {
    this.weather = weather;
    tempString = java.lang.String.format(("%.1f" + ((char) (176))), weather.getTemp());
    init();
}