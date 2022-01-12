public boolean deleteExtrasFromReminder(int reminderId) throws ve.com.abicelis.remindy.exception.CouldNotDeleteDataException {
    android.database.sqlite.SQLiteDatabase db = mDatabaseHelper.getWritableDatabase();
    return (db.delete(RemindyContract.ExtraTable.TABLE_NAME, ((RemindyContract.ExtraTable.COLUMN_NAME_REMINDER_FK) + " =?"), new java.lang.String[]{ java.lang.String.valueOf(reminderId) })) > 0;
}