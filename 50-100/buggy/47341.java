public void assignOpenClosingTimesToGlobal(java.util.Date weekdayStart, java.util.Date weekdayEnd, java.util.Date weekendStart, java.util.Date weekendEnd) {
    java.lang.String MFOpen = program.timeToStr(weekdayStart);
    java.lang.String MFClose = program.timeToStr(weekdayEnd);
    java.lang.String SSOpen = program.timeToStr(weekendStart);
    java.lang.String SSClose = program.timeToStr(weekendEnd);
    assignOpenClosingTimesToWeekDays(MFOpen, MFClose);
    assignOpenClosingTimesToWeekEnds(SSOpen, SSClose);
}