public boolean isEligibalAircraft(xiaMengAirline.searchEngine.Aircraft aircraft, xiaMengAirline.searchEngine.AirPort sourceAir, xiaMengAirline.searchEngine.AirPort destAir) {
    java.lang.String searchKey = ((((aircraft.getId()) + "_") + (sourceAir.getId())) + "_") + (destAir.getId());
    return InitData.airLimitationList.contains(searchKey) ? true : false;
}