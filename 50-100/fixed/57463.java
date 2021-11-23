public void reset() {
    clear();
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    db.delete(me.herbix.dice.Statistics.TABLE, ((((me.herbix.dice.Statistics.ROW_DICE_PROPERTY) + " = '") + (currentProperty)) + "'"), null);
    db.close();
}