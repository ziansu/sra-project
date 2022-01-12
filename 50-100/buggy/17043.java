com.bixls.dollarprices.Country GetCountryByCurFull(java.lang.String curFull) {
    for (int i = 0; i < (Countries.size()); i++) {
        if ((Countries.get(i).CurFull) == curFull) {
            return Countries.get(i);
        }
    }
    return null;
}