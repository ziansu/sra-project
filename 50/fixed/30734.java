private java.util.Date parseStringDate(java.lang.String startDate) {
    java.text.DateFormat formatter = new java.text.SimpleDateFormat("yy-mm-dd");
    try {
        return formatter.parse(startDate);
    } catch (java.text.ParseException e) {
        e.printStackTrace();
    }
    return null;
}