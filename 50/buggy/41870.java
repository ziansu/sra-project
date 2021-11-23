public static java.lang.String getTimeString(java.util.Date d) {
    java.text.DateFormat dateFormat = java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT, net.sf.memoranda.util.Local.currentLocale);
    return dateFormat.format(d);
}