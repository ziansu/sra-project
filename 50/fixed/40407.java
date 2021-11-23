public static void list(boolean showPauseButton) {
    models.datatable.DisasterRecoveryDataTable dataTable = controllers.infra.DisasterRecovery.createDisasterRecoveryDataTable();
    java.lang.String localSiteUuid = util.DisasterRecoveryUtils.getLocalUuid();
    render(dataTable, showPauseButton, localSiteUuid);
}