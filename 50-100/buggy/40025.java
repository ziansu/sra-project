public void deleteUser() {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    java.lang.String query = ("DELETE FROM " + (android.internest.com.internest.MyDBHandler.TABLE_USER)) + " WHERE 1;";
    db.execSQL(query);
    android.internest.com.internest.User user = new android.internest.com.internest.User("null", "null");
    addUser(user);
}