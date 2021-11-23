public org.arabeyes.itl.hijri.ConvertedDate hDate(java.util.Date date) {
    java.util.GregorianCalendar cal = new java.util.GregorianCalendar();
    cal.setTime(date);
    if ((cal.get(java.util.Calendar.ERA)) != (java.util.GregorianCalendar.AD))
        throw new java.lang.IllegalArgumentException("Era other than AD is not supported");
    
    return hDate(cal.get(java.util.Calendar.DAY_OF_MONTH), ((cal.get(java.util.Calendar.MONTH)) + 1), cal.get(java.util.Calendar.YEAR));
}