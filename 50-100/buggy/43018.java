private com.ichi2.async.DeckTask.TaskData doInBackgroundCloseDeck(com.ichi2.async.DeckTask.TaskData... params) {
    android.util.Log.i(AnkiDroidApp.TAG, "doInBackgroundCloseDeck");
    com.ichi2.libanki.Collection col = params[0].getCollection();
    java.lang.String path = col.getPath();
    col.close(true);
    com.ichi2.anki.BackupManager.performBackup(path);
    return null;
}