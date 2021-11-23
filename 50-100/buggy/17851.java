public static java.sql.Time strToTime(java.lang.String strDate) {
    if (strDate == "")
        return null;
    
    java.lang.String str = strDate;
    java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("hh:mm:ss");
    java.util.Date d = null;
    try {
        d = format.parse(str);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    java.sql.Time time = new java.sql.Time(d.getTime());
    return time.valueOf(str);
}