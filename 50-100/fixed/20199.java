com.bixls.dollarprices.Country GetCountryByCode(java.lang.String code) {
    for (int i = 0; i < (Countries.size()); i++) {
        if (code.equals(Countries.get(i).Code)) {
            return Countries.get(i);
        }
    }
    return null;
}