@java.lang.Override
public java.time.chrono.ChronoPeriod until(java.time.chrono.ChronoLocalDate endDateExclusive) {
    org.threeten.extra.chrono.PaxDate end = org.threeten.extra.chrono.PaxDate.from(endDateExclusive);
    int years = java.lang.Math.toIntExact(yearsUntil(end));
    org.threeten.extra.chrono.PaxDate sameYearEnd = this.plusYears(years);
    int months = ((int) (sameYearEnd.monthsUntil(end)));
    int days = ((int) (sameYearEnd.plusMonths(months).daysUntil(end)));
    return getChronology().period(years, months, days);
}