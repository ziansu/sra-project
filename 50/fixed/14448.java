public static java.lang.String format(java.util.Date dateTime) {
    java.lang.String dot = new java.text.SimpleDateFormat("yyyy-MM-dd.HH:mm:ss").format(dateTime);
    return dot.replaceAll("[.]", "T");
}