public static java.util.Date parseTime(java.lang.String time) {
    java.text.SimpleDateFormat[] formats = new java.text.SimpleDateFormat[]{ new java.text.SimpleDateFormat("hh:mm a") , new java.text.SimpleDateFormat("HH:mm") };
    java.util.Date date = null;
    for (java.text.SimpleDateFormat sdf : formats) {
        try {
            date = sdf.parse(time);
            break;
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }
    }
    return date;
}