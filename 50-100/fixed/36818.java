private void addYearData(java.lang.Integer year, java.lang.String aprtCode, gov.faa.ang.swac.uas.scheduler.forecast.trip_distribution.ForecastTripDistAirportDataCount aprtCount) {
    gov.faa.ang.swac.uas.scheduler.forecast.airport_data.ForecastAirportCountsMap map = null;
    if (tafByYear.containsKey(year)) {
        map = tafByYear.get(year);
    }else {
        map = new gov.faa.ang.swac.uas.scheduler.forecast.airport_data.ForecastAirportCountsMap();
        tafByYear.put(year, map);
    }
    map.addData(aprtCode, aprtCount);
}