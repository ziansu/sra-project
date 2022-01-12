public android.database.Cursor getDataFromARow(java.lang.String ID) {
    c = db.rawQuery("SELECT * FROM Reminder_tabledb WHERE _id = ?", new java.lang.String[]{ ID });
    if ((c.getCount()) > 0) {
        c.moveToFirst();
    }
    db.close();
    return c;
}