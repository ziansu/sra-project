public java.lang.String constructReportingUrl(java.lang.StringBuffer path) {
    java.lang.String url = (((apiBase) + (reportingURL)) + "/") + (path.toString());
    return url;
}