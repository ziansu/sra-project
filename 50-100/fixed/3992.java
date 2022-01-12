private void setList() {
    pos = 0;
    for (int i = 0; i < (cities.size()); i++) {
        com.a5agency.fhate.weather.CitiesFragment.getWeather gw = new com.a5agency.fhate.weather.CitiesFragment.getWeather();
        gw.execute(cities.get(i).name);
    }
    Settings.saveCityList(com.a5agency.fhate.weather.CitiesFragment.TAG_CITIES, cities, getContext());
}