public boolean areNotesImported(@android.support.annotation.NonNull
java.lang.String password, @android.support.annotation.NonNull
android.content.Context context) {
    mBackupStorageHandler = new nl.yoerinijs.notebuddy.files.backup.BackupStorageHandler();
    if (!(mBackupStorageHandler.isExternalStorageWritable())) {
        return false;
    }
    if ((getNumberOfFilesInDir()) <= 0) {
        return false;
    }
    try {
        return areNotesImported(context, password);
    } catch (java.lang.Exception e) {
        android.util.Log.d(nl.yoerinijs.notebuddy.files.backup.BackupImporter.LOG_TAG, e.getMessage());
        return false;
    }
}