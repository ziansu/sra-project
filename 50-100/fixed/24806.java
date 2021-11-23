private static void log(java.lang.String message) {
    java.util.Date date = new java.util.Date();
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("hh:mm:ss.SSS");
    java.lang.String formattedDate = sdf.format(date);
    java.lang.System.out.println(((formattedDate + "   ") + message));
}