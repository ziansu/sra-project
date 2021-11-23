private java.util.Date formatYYYY_MM(java.lang.Object s) {
    java.util.regex.Matcher m = ptYYYY_MM.matcher(s.toString());
    m.matches();
    int yy = java.lang.Integer.parseInt(m.group(1));
    int mm = java.lang.Integer.parseInt(m.group(2));
    dateFormat = com.calculator.aa.ui.MainWindow.DateFormats.DATE_FORMAT_YYYY_MM;
    java.util.Calendar c = java.util.Calendar.getInstance();
    c.set(yy, (mm - 1), 1);
    return c.getTime();
}