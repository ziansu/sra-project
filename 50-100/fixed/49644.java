public java.io.BufferedReader getReport(com.mediamath.terminalone.models.reporting.Reports report, com.mediamath.terminalone.ReportCriteria criteria) throws com.mediamath.terminalone.exceptions.ClientException {
    criteria.setReportName(report.getReportName());
    java.lang.StringBuilder path;
    path = reportService.getReportUri(criteria);
    java.lang.String finalPath = tOneService.constructReportingUrl(path);
    return reportService.getReportData(report, finalPath, connection, user);
}