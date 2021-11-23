public android.database.Cursor getMedicalReport(long rowId) {
    java.lang.String where = ((team9.clip_loginhomecareer.DatabaseContract.MedicalReportEntries._ID) + "=") + rowId;
    android.database.Cursor c = db.query(true, team9.clip_loginhomecareer.DatabaseContract.MedicalReportEntries.TABLE_NAME, team9.clip_loginhomecareer.DatabaseContract.MedicalReportEntries.ALL_COLUMNS, where, null, null, null, null, null);
    if (c != null) {
        c.moveToFirst();
    }
    return c;
}