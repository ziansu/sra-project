public com.mediamath.terminalone.models.reporting.ReportValidationResponse validateReport(com.mediamath.terminalone.models.reporting.Reports report, com.mediamath.terminalone.ReportCriteria criteria) throws com.mediamath.terminalone.exceptions.ClientException {
    criteria.setReportName(((report.getReportName()) + "/validate"));
    java.lang.StringBuffer path = null;
    path = reportService.getReportUri(criteria);
    java.lang.String finalPath = tOneService.constructReportingUrl(path);
    com.mediamath.terminalone.models.reporting.ReportValidationResponse validationResponse = reportService.validateReportData(report, finalPath, connection, user);
    return validationResponse;
}