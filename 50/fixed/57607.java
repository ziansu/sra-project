@java.lang.Override
public void onFormatChosen(uk.ac.ucl.excites.sapelli.collector.fragments.ExportFragment formatFragment) {
    uk.ac.ucl.excites.sapelli.collector.tasks.RecordsTasks.runExportTask(activity, result, formatFragment, fileStorageProvider.getExportFolder(true), activity.getString(R.string.backup), this);
}