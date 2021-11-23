public void handleCityOfRelocationChange(java.lang.String newCity) {
    java.lang.String city = data.getRelocationCity();
    if (newCity.equals(city)) {
        data.setRelocationCity(city);
        return ;
    }
    if (newCity.isEmpty()) {
        data.setRelocationCity(null);
        hasChanges = true;
    }
}