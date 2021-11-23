private thredds.server.radarServer2.CalendarDateRange rangeFromFormat(java.text.SimpleDateFormat fmt, thredds.server.radarServer2.CalendarDateRange range) {
    if (range == null)
        return null;
    
    thredds.server.radarServer2.CalendarDate newStart = reparseDate(fmt, range.getStart());
    thredds.server.radarServer2.CalendarDate newEnd = reparseDate(fmt, range.getEnd());
    return thredds.server.radarServer2.CalendarDateRange.of(newStart, newEnd.add(rangeAdjustment));
}