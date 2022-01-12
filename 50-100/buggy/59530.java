public static org.apache.syncope.ide.netbeans.service.ReportTemplateManagerService getReportTemplateManagerService() throws java.io.IOException {
    synchronized(org.apache.syncope.ide.netbeans.ResourceConnector.REPORT_TEMPLATE_MONITOR) {
        if ((org.apache.syncope.ide.netbeans.ResourceConnector.REPORT_TEMPLATE_MANAGER_SERVICE) == null) {
            org.apache.syncope.ide.netbeans.ConnectionParams connParams = org.apache.syncope.ide.netbeans.ResourceConnector.getConnectionParams();
            org.apache.syncope.ide.netbeans.ResourceConnector.REPORT_TEMPLATE_MANAGER_SERVICE = new org.apache.syncope.ide.netbeans.service.ReportTemplateManagerService(connParams.getUrl(), connParams.getUsername(), connParams.getPassword());
        }
    }
    return org.apache.syncope.ide.netbeans.ResourceConnector.REPORT_TEMPLATE_MANAGER_SERVICE;
}