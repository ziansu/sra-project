private java.util.Date formatYYYY(java.lang.Object s) {
    dateFormat = com.calculator.aa.ui.MainWindow.DateFormats.DATE_FORMAT_YYYY;
    java.util.Calendar c = java.util.Calendar.getInstance();
    c.set(java.lang.Integer.parseInt(s.toString()), 0, 1);
    return c.getTime();
}