private void exportSubmission() {
    java.lang.String tableId = tableIds[tableSpin.getSelectedItemPosition()];
    org.opendatakit.tables.tasks.ExportTask task = new org.opendatakit.tables.tasks.ExportTask(org.opendatakit.tables.utils.ImportExportDialog.newInstance(ImportExportDialog.EXPORT_IN_PROGRESS_DIALOG, this), appName, this);
    task.execute(new org.opendatakit.tables.tasks.ExportRequest(appName, tableId, filenameValField.getText().toString().trim()));
}