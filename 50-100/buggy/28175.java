@java.lang.Override
public java.time.LocalDate getStartDate(java.time.LocalDate iDate) throws java.lang.Exception {
    java.time.LocalDate sDate = java.time.LocalDate.ofYearDay(iDate.getYear(), 1);
    while ((java.time.temporal.ChronoUnit.DAYS.between(sDate, iDate)) >= 8) {
        sDate.plusDays(8);
    } 
    return sDate;
}