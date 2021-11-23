public android.database.Cursor radomDateQuery() {
    java.lang.String dateOfDay = com.example.huiweidong.Reminder.DateOfDay.getDateOfDay();
    c = db.rawQuery("SELECT _id, CONTACT_PERSON,REPEATSNR,REPEATSINTERVAL,UNSHARPENNR,RADOMDATE FROM Reminder_tabledb WHERE RADOMDATE = ?", new java.lang.String[]{ dateOfDay });
    return c;
}