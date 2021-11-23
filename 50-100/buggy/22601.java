public static java.lang.String marshal(final java.util.Date value) {
    if (value == null) {
        return null;
    }
    java.util.Calendar cal = new java.util.GregorianCalendar();
    cal.setTime(value);
    java.text.SimpleDateFormat sf = com.admazing.core.models.DateAdapter.dateFormatter.get();
    java.lang.String strCal = javax.xml.bind.DatatypeConverter.printDate(cal);
    java.lang.System.out.printf(("Date" + strCal));
    return sf.format(value);
}