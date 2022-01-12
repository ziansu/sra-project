public org.md2k.datakitapi.status.Status insert(android.database.sqlite.SQLiteDatabase db, int dataSourceId, org.md2k.datakitapi.datatype.DataType dataType) {
    org.md2k.datakitapi.status.Status status = new org.md2k.datakitapi.status.Status(org.md2k.datakitapi.status.Status.SUCCESS);
    android.content.ContentValues contentValues = prepareData(dataSourceId, dataType);
    cValues.add(contentValues);
    if (((dataType.getDateTime()) - (lastUnlock)) >= (org.md2k.datakit.logger.DatabaseTable_Data.WAITTIME)) {
        status = insertDB(db, org.md2k.datakit.logger.DatabaseTable_Data.TABLE_NAME, cValues);
        lastUnlock = dataType.getDateTime();
    }
    return status;
}