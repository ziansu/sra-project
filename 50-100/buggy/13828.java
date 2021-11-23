private java.lang.String testCalculateVariable() {
    if (number.equals("_CURRENT_DATE")) {
        java.lang.String ssTimeZone = getExpressionBeanService().getSSTimeZone();
        if ((ssTimeZone == "") || (ssTimeZone == null))
            ssTimeZone = java.util.TimeZone.getDefault().getID();
        
        org.joda.time.DateTimeZone ssZone = org.joda.time.DateTimeZone.forID(ssTimeZone);
        org.joda.time.DateMidnight dm = new org.joda.time.DateMidnight(ssZone);
        org.joda.time.format.DateTimeFormatter fmt = org.joda.time.format.ISODateTimeFormat.date();
        return fmt.print(dm);
    }
    return null;
}