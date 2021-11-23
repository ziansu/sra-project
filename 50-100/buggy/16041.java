private static java.lang.String dateTime(java.util.GregorianCalendar startDate, long timestepSize, int steplapse) {
    java.util.GregorianCalendar endDate = new java.util.GregorianCalendar();
    endDate.setTime(startDate.getTime());
    endDate.add(java.util.Calendar.MILLISECOND, (((int) (timestepSize)) * steplapse));
    if ((timestepSize % 1000) == 0)
        return anl.verdi.util.Utilities.formatDate(endDate);
    
    return anl.verdi.util.Utilities.formatDateMS(endDate);
}