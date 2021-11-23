public ship.WeatherWaypoint closestWeatherWaypoint() {
    int theCounter = checkClosestWeather();
    for (int i = 0; i < (weatherWaypoints.size()); i++) {
        if (i == theCounter) {
            return weatherWaypoints.get(i);
        }
    }
    java.lang.System.out.println("returning Null");
    return null;
}