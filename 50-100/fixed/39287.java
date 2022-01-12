public void handleCityOfRelocationChange(java.lang.String newCity) {
    java.lang.String city = data.getRelocationCity();
    if (newCity.equals(city)) {
        data.setRelocationCity(city);
    }else {
        data.setRelocationCity(newCity);
        hasChanges = true;
    }
    if (newCity.isEmpty()) {
        data.setRelocationCity(null);
        hasChanges = true;
    }
}