public static java.lang.String formatDateTime(java.time.LocalDateTime t) {
    java.time.format.DateTimeFormatter formatter;
    if (t != null) {
        if ((t.getMinute()) == 0) {
            formatter = java.time.format.DateTimeFormatter.ofPattern("MMM.d uuuu ha").withLocale(java.util.Locale.ENGLISH);
        }else {
            formatter = java.time.format.DateTimeFormatter.ofPattern("MMM.d uuuu h.ma").withLocale(java.util.Locale.ENGLISH);
        }
        return t.format(formatter);
    }else {
        return null;
    }
}