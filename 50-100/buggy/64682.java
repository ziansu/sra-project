@org.mule.api.annotations.lifecycle.Start
public void initialiseAndConfigureServices() {
    reportService = new org.mule.modules.google.dfp.services.ReportService();
    java.lang.Long[] ids = customIds.toArray(new java.lang.Long[customIds.size()]);
    long[] customFieldIds = org.apache.commons.lang.ArrayUtils.toPrimitive(ids);
    if ((customFieldIds.length) > 0) {
        reportService.setCustomFieldsIds(customFieldIds);
    }
    companyService = new org.mule.modules.google.dfp.services.CompanyService();
    reconciliationReportService = new org.mule.modules.google.dfp.services.ReconciliationReportService();
    reconciliationReportRowService = new org.mule.modules.google.dfp.services.ReconciliationReportRowService();
}