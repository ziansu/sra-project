private long getDOBTimeInMillis(java.lang.String dob) {
    java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("dd-MM-yyyy");
    java.util.Date d = null;
    try {
        d = formatter.parse(dob);
    } catch (java.text.ParseException e) {
        return 0;
    }
    return d.getTime();
}