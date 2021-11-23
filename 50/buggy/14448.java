public static java.lang.String format(java.util.Date dateTime) {
    java.lang.String dot = new java.text.SimpleDateFormat("yyyy-MM-dd.HH:mm:ss").format(new java.util.Date());
    return dot.replaceAll("[.]", "T");
}