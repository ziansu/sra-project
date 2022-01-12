private java.util.Calendar getStartDate(java.util.List<java.util.Date> tempDates1, java.util.List<java.util.Date> tempDates2) {
    org.joda.time.LocalDateTime date;
    if ((tempDates1.size()) == 0) {
        date = createEmptyDate();
    }else
        if ((tempDates1.size()) == 1) {
            date = createEmptyDate();
        }else {
            date = fixDate(tempDates1.get(0), tempDates2.get(0));
        }
    
    return convertToCalendar(date);
}