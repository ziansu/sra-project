public static java.util.Collection<hslu.bda.medimemory.entity.Status> getAllStatusValues(hslu.bda.medimemory.database.DbAdapter dbAdapter) {
    java.util.Collection<hslu.bda.medimemory.entity.Status> allStatusValues = null;
    try {
        java.util.Collection<android.content.ContentValues> allContentValues = dbAdapter.getAllByTable(DbHelper.TABLE_MEDI_STATUS);
        for (android.content.ContentValues contentValues : allContentValues) {
            hslu.bda.medimemory.entity.Status status = hslu.bda.medimemory.entity.Status.copyContentValuesToObject(contentValues);
            allStatusValues.add(status);
        }
    } catch (java.lang.Exception e) {
        java.lang.System.console().printf(e.getMessage());
    }
    return allStatusValues;
}