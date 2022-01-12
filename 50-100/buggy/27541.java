@java.lang.Override
public java.time.chrono.ChronoPeriod until(java.time.chrono.ChronoLocalDate endDateExclusive) {
    org.threeten.extra.chrono.PaxDate end = org.threeten.extra.chrono.PaxDate.from(endDateExclusive);
    int years = java.lang.Math.toIntExact(yearsUntil(end));
    org.threeten.extra.chrono.PaxDate sameYearEnd = end.plusYears(years);
    int months = ((int) (monthsUntil(sameYearEnd)));
    int days = ((int) (daysUntil(sameYearEnd.plusMonths(months))));
    return getChronology().period(years, months, days);
}