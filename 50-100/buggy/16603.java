private java.util.Date formatMM_YYYY(java.lang.String s) {
    java.util.regex.Matcher m = ptMM_YYYY.matcher(s);
    m.matches();
    int mm = java.lang.Integer.parseInt(m.group(1));
    int yy = java.lang.Integer.parseInt(m.group(2));
    dateFormat = com.calculator.aa.ui.MainWindow.DateFormats.DATE_FORMAT_MM_YYYY;
    java.util.Calendar c = java.util.Calendar.getInstance();
    c.set(yy, (mm - 1), 1);
    return c.getTime();
}