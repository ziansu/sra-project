@java.lang.Override
public void querySuccess(java.util.List<uk.ac.ucl.excites.sapelli.storage.model.Record> result) {
    if ((result == null) || (result.isEmpty()))
        activity.showOKDialog(R.string.title_activity_export, R.string.exportNoRecordsFound, R.drawable.ic_export_black_36dp);
    else {
        java.lang.String selectionDesc = "TODO";
        uk.ac.ucl.excites.sapelli.collector.tasks.RecordsTasks.runExportTask(result, this, exportFolder, selectionDesc, this);
    }
}