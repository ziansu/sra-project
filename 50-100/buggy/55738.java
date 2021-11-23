double findCumReturn(java.util.Date asOf, java.util.Date base) {
    if (asOf.before(base))
        return java.lang.Double.NaN;
    
    com.angela.cumulativeReturn.CumRetCalculator.DateRange range = new com.angela.cumulativeReturn.CumRetCalculator.DateRange(asOf, base);
    if (!(dailyReturnCache.containsKey(range)))
        dailyReturnCache.putIfAbsent(range, computeCumReturn(range));
    
    return dailyReturnCache.get(range);
}