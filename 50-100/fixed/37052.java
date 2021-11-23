private java.lang.String createReportDateWith20YearPrefix(java.lang.String nextReportDate) {
    java.lang.String[] dateParts = org.apache.commons.lang3.StringUtils.split(nextReportDate, '/');
    if ((dateParts.length) == 3) {
        return ((((dateParts[0]) + '/') + (dateParts[1])) + "/20") + (dateParts[2]);
    }
    return null;
}