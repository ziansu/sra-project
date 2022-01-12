public java.lang.String getCityByLetter(by.htp.domain.entity.Player p, char l) {
    java.util.List<java.lang.String> knownCities = p.getKnownCities();
    for (int i = 0; i < (knownCities.size()); i++) {
        city = ((java.lang.String) (knownCities.get(i)));
        letter = city.charAt(0);
        if ((letter) == (java.lang.Character.toUpperCase(l)))
            return city;
        
    }
    return "0";
}