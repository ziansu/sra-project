public void deleteData(java.lang.String ID) {
    db.execSQL(("DELETE FROM Reminder_tabledb WHERE _id =" + ID));
}