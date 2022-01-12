public java.lang.String getDateFromDateTime(jodatime.Date date, java.lang.Boolean display) throws jodatime.ParseException {
    org.joda.time.format.DateTimeFormatter dtFormatter;
    if (display)
        dtFormatter = org.joda.time.format.DateTimeFormat.forPattern("MM/dd/yyyy");
    else
        dtFormatter = org.joda.time.format.DateTimeFormat.forPattern("yyyy-MM-dd");
    
    org.joda.time.DateTime dt = new org.joda.time.DateTime(date);
    java.lang.String myDate = dt.toString(dtFormatter);
    java.lang.System.out.println((((((("OrderDisplayUtil.java:getDateFromDateTime(" + date) + ", ") + display) + "): ") + "myDate = ") + myDate));
    return myDate;
}