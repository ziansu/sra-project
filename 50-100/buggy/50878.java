public java.lang.String geteEducationDate() {
    java.lang.String lastEducationInsertedDate;
    java.lang.String query = ((((((((("SELECT " + (DatabaseHelper.COLUMN_EXPENDITURE_INSERTDATE)) + " FROM ") + (DatabaseHelper.TABLE_EXPENDITURE)) + " WHERE ") + (com.example.eq62roket.CashTime.helper.DatabaseHelper.COLUMN_EXPENDITURE_EDUCATION)) + " IS NOT 0 ") + " order by ") + (DatabaseHelper.COLUMN_EXPENDITURE_ID)) + " desc ") + " limit 1";
    android.database.Cursor data = database.rawQuery(query, null);
    data.moveToLast();
    lastEducationInsertedDate = data.getString(0);
    return lastEducationInsertedDate;
}