@java.lang.Override
protected java.time.LocalDateTime getDateByLine(java.lang.String dateLine) {
    java.lang.String[] dateParts = dateLine.split(jobSite.getSplit());
    com.olegshan.tools.MonthsTools.removeZero(dateParts);
    int day = java.lang.Integer.parseInt(dateParts[0]);
    int month = MonthsTools.MONTHS.get(dateParts[1].toLowerCase());
    int year = getYear(month);
    return java.time.LocalDate.of(year, month, day).atTime(getTime());
}