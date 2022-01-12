public boolean insertBudget(final java.lang.String name, final int max) {
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    android.content.ContentValues contentValues = new android.content.ContentValues();
    contentValues.put(protect.budgetwatch.DBHelper.BudgetDbIds.NAME, name);
    contentValues.put(protect.budgetwatch.DBHelper.BudgetDbIds.MAX, max);
    final long newId = db.insert(protect.budgetwatch.DBHelper.BudgetDbIds.TABLE, null, contentValues);
    return newId != 1;
}