public static com.avengers.model.CountryCity parse(java.lang.String countryCityString) {
    com.avengers.model.CountryCity countryCity = new com.avengers.model.CountryCity();
    java.lang.String[] temp = countryCityString.split(":");
    if ((temp.length) == 2) {
        countryCity.setCountry(temp[0]);
        countryCity.setCity(temp[1]);
    }else {
        throw new java.lang.RuntimeException("Invalid Country city String");
    }
    return countryCity;
}