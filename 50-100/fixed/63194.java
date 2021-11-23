private java.lang.String getTime(int hr, int min) {
    try {
        java.sql.Time tme = new java.sql.Time(hr, min, 0);
        java.text.Format formatter = new java.text.SimpleDateFormat("hh:mm a");
        return formatter.format(tme).toUpperCase();
    } catch (java.lang.Exception e) {
        return (("" + hr) + ":") + min;
    }
}