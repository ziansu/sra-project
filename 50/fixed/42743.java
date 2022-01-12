public java.util.List<airline_model.City> addCity(java.lang.String city) {
    this.availableCities.add(new airline_model.City(city));
    return new java.util.ArrayList<airline_model.City>(availableCities);
}