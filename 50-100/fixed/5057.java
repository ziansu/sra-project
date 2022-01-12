public void waitForHub(final com.blackducksoftware.integration.hub.service.HubServicesFactory services, final java.lang.String hubProjectName, final java.lang.String hubProjectVersion, final long scanStartedTimeout, final long scanFinishedTimeout) {
    final com.blackducksoftware.integration.hub.dataservice.scan.ScanStatusDataService scanStatusDataService = services.createScanStatusDataService(new com.blackducksoftware.integration.log.Slf4jIntLogger(logger));
    try {
        scanStatusDataService.assertBomImportScanStartedThenFinished(hubProjectName, hubProjectVersion, (scanStartedTimeout * 1000), (scanFinishedTimeout * 1000), new com.blackducksoftware.integration.log.Slf4jIntLogger(logger));
    } catch (com.blackducksoftware.integration.hub.exception.HubIntegrationException e) {
        logger.error(java.lang.String.format(Constants.SCAN_ERROR_MESSAGE, e.getMessage()), e);
    }
}