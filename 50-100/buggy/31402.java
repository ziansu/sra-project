private ua.nick.weather.model.City parsePlace(java.lang.String cityText, java.lang.Double lat, java.lang.Double lng) {
    java.lang.String[] cityArray = cityText.split(",");
    java.lang.String name = cityArray[0].trim();
    java.lang.String country = cityArray[((cityArray.length) - 1)].trim();
    ua.nick.weather.model.City city = new ua.nick.weather.model.City(name, country, lat, lng);
    return city;
}