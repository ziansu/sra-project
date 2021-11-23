public static java.util.Collection<hslu.bda.medimemory.entity.Eat> getAllEatValues(hslu.bda.medimemory.database.DbAdapter dbAdapter) {
    java.util.Collection<hslu.bda.medimemory.entity.Eat> allEatValues = new java.util.ArrayList<hslu.bda.medimemory.entity.Eat>();
    try {
        java.util.Collection<android.content.ContentValues> allContentValues = dbAdapter.getAllByTable(DbHelper.TABLE_MEDI_EAT);
        for (android.content.ContentValues contentValues : allContentValues) {
            hslu.bda.medimemory.entity.Eat eat = hslu.bda.medimemory.entity.Eat.copyContentValuesToObject(contentValues);
            allEatValues.add(eat);
        }
    } catch (java.lang.Exception e) {
        java.lang.System.console().printf(e.getMessage());
    }
    return allEatValues;
}