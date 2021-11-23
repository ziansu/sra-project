private long getDOBTimeInMillis(java.lang.String dob) {
    @android.annotation.SuppressLint(value = "SimpleDateFormat")
    java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("dd-MM-yyyy");
    java.util.Date d;
    try {
        d = formatter.parse(dob);
    } catch (java.text.ParseException e) {
        return 0;
    }
    return d.getTime();
}