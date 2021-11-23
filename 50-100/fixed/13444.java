public com.mediamath.terminalone.models.reporting.meta.MetaData getReportsMeta(com.mediamath.terminalone.models.reporting.Reports report) {
    java.lang.StringBuilder reportName = new java.lang.StringBuilder(report.getReportNameWithMeta());
    java.lang.String finalPath = tOneService.constructReportingUrl(reportName);
    java.lang.String response = this.connection.get(finalPath, this.getUser());
    return reportService.parseReportMetaResponse(response);
}