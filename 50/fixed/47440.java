@java.lang.Override
public ua.olejnik.domain.Weather getCurrentWeather(java.lang.String city) throws java.io.IOException, org.json.simple.parser.ParseException {
    return getWeatherFromJson(getJsonFromServer(city));
}