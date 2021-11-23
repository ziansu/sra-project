public static void pauseResume() {
    models.datatable.DisasterRecoveryDataTable dataTable = controllers.infra.DisasterRecovery.createDisasterRecoveryDataTable();
    render(dataTable);
}