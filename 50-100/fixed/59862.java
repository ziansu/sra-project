protected void successInstance() {
    try {
        end();
        addPropertiesSuccess();
        addPropertiesProcessingTime();
        writePropertiesToLog(this.auditor, org.apache.log4j.Level.INFO);
    } catch (java.lang.Exception e) {
        logger.error(("Failed logging Scheduler transaction success: " + (e.getMessage())), e);
    }
}