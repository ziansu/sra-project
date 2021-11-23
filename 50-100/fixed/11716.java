private void deleteAppointmentByDateInt(java.lang.Integer date) {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    java.lang.String Query = (((((((("DELETE FROM " + (com.z3r0byte.magistify.DatabaseHelpers.CalendarDB.TABLE_CALENDAR)) + " WHERE ") + (com.z3r0byte.magistify.DatabaseHelpers.CalendarDB.KEY_FORMATTED_START)) + " <= ") + date) + " AND ") + (com.z3r0byte.magistify.DatabaseHelpers.CalendarDB.KEY_FORMATTED_END)) + " >= ") + date;
    db.execSQL(Query);
}