public static gov.nih.nci.cabig.caaers.domain.report.ReportDefinition createReportDefinition(java.lang.String name, gov.nih.nci.cabig.caaers.domain.Organization org, gov.nih.nci.cabig.caaers.domain.ConfigProperty reportType) {
    gov.nih.nci.cabig.caaers.domain.report.ReportDefinition def = new gov.nih.nci.cabig.caaers.domain.report.ReportDefinition();
    def.setEnabled(true);
    def.setName(name);
    def.setOrganization(org);
    def.addPlannedNotification(gov.nih.nci.cabig.caaers.domain.Fixtures.createPlannedEmailNotification());
    def.setGroup(reportType);
    return def;
}