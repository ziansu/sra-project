public java.util.Calendar getCalendar() {
    com.alirezaafkar.sundatepicker.components.JDF jdf = new com.alirezaafkar.sundatepicker.components.JDF();
    jdf.setIranianDate(year, month, day);
    java.util.Calendar calendar = java.util.Calendar.getInstance();
    calendar.set(jdf.getGregorianYear(), jdf.getGregorianMonth(), jdf.getGregorianDay());
    return calendar;
}