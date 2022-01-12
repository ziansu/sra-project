public java.lang.String constructReportingUrl(java.lang.StringBuilder path) {
    java.lang.String url = (((apiBase) + (reportingURL)) + "/") + (path.toString());
    return url;
}