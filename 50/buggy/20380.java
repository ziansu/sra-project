protected void runCustomChecks() {
    com.dbquality.DBQualityExecutionHandler.logger.info("Started working on custom checks");
    com.dbquality.custom.checks.elements.CustomRootElement customElement = com.dbquality.custom.checks.xml.CustomXMLHolder.getInstance().getCustomElement();
    com.dbquality.custom.checks.sql.CustomSQLExecutionHandler customExec = new com.dbquality.custom.checks.sql.CustomSQLExecutionHandler(customElement);
    customExec.execute();
}