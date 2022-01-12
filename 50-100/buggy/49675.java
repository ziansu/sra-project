public int getDishesCount() {
    java.lang.String countQuery = "SELECT * FROM " + (com.stand_still.foodpinions.classes.DatabaseHandler.TABLE_DISHES);
    android.database.sqlite.SQLiteDatabase db = this.getReadableDatabase();
    android.database.Cursor cursor = db.rawQuery(countQuery, null);
    int count = cursor.getCount();
    cursor.close();
    return count;
}