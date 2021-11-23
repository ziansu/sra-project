private void addDatabaseLabel(java.lang.String experimentId, java.lang.String trialId, com.google.android.apps.forscience.whistlepunk.filemetadata.Label label, com.google.android.apps.forscience.whistlepunk.filemetadata.LabelValue labelValue) {
    synchronized(mLock) {
        final android.database.sqlite.SQLiteDatabase db = mDbHelper.getWritableDatabase();
        com.google.android.apps.forscience.whistlepunk.metadata.SimpleMetaDataManager.addDatabaseLabel(db, experimentId, trialId, label, labelValue);
    }
}