public java.lang.String convertCalendarToString(java.util.GregorianCalendar toBeConverted) {
    java.lang.String result = new java.lang.String();
    java.text.SimpleDateFormat df = new java.text.SimpleDateFormat("MM dd yyyy HHmm");
    result = df.format(toBeConverted.getTime());
    java.lang.System.out.println(((toBeConverted + " was converted to ") + result));
    return result;
}