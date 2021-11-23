@java.lang.Override
public java.util.List<java.time.LocalDate> calcNearestDatesByCronPatternAfter(java.util.Set<java.time.LocalDate> holidays, java.lang.String cronPattern) {
    if (holidays.isEmpty())
        return new java.util.LinkedList<>();
    
    java.time.LocalDate minDay = com.github.uryyyyyyy.bizCalendarUtil.impl.ImplUtil.minDay(holidays);
    java.time.LocalDate maxDay = com.github.uryyyyyyy.bizCalendarUtil.impl.ImplUtil.maxDay(holidays);
    java.util.List<java.time.LocalDate> cronDayList = com.github.uryyyyyyy.bizCalendarUtil.impl.ImplUtil.calcCron(cronPattern, minDay, maxDay);
    return com.github.uryyyyyyy.bizCalendarUtil.impl.ImplUtil.calcHolidayAfter(cronDayList, holidays);
}