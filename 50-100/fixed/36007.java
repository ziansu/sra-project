@java.lang.Override
public com.opengamma.util.tuple.Pair<javax.time.calendar.LocalDate, java.lang.Double> getLatestDataPoint(com.opengamma.id.UniqueId uniqueId) {
    com.opengamma.core.historicaltimeseries.HistoricalTimeSeries hts = getHistoricalTimeSeries(uniqueId);
    if (((hts == null) || ((hts.getTimeSeries()) == null)) || (hts.getTimeSeries().isEmpty())) {
        return null;
    }else {
        return new com.opengamma.util.tuple.ObjectsPair<javax.time.calendar.LocalDate, java.lang.Double>(hts.getTimeSeries().getLatestTime(), hts.getTimeSeries().getLatestValue());
    }
}