public java.util.Date getDate() {
    edu.gemini.shared.gui.calendar.YearMonthDay ymd = getCalendarMonth().getDate();
    if (ymd == null)
        return null;
    
    java.util.Calendar c = new java.util.GregorianCalendar();
    c.clear();
    c.setTimeZone(_tz);
    c.set(c.YEAR, ymd.year);
    c.set(c.MONTH, ymd.month);
    c.set(c.DAY_OF_MONTH, ymd.day);
    if (c == null)
        return null;
    
    return c.getTime();
}