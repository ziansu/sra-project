public boolean isInternational(java.lang.String airport1, java.lang.String airport2) {
    if ((InitData.domesticAirportList.contains(airport1)) && (InitData.domesticAirportList.contains(airport2))) {
        return false;
    }
    return true;
}