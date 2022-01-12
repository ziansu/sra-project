public boolean isUpToDate(fr.mvanbesien.yws.core.WeatherData weatherData) {
    if (weatherData == null) {
        return false;
    }
    if (((weatherData.getPubDate().getTime()) + (weatherData.getTtl())) < (java.lang.System.currentTimeMillis())) {
        if (((weatherData.getLastBuildDate().getTime()) + ((15 * 60) * 1000)) < (java.lang.System.currentTimeMillis())) {
            return true;
        }
    }
    return false;
}