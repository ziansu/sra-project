public void getAvailableCountries() {
    java.util.List<com.realdolmen.redoairproject.entities.Country> countries = tripRepository.findAllCountriesFromTrips();
    for (com.realdolmen.redoairproject.entities.Country c : countries) {
        countryNameList.add(c.getCountry());
    }
}