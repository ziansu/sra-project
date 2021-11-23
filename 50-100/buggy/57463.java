public void reset() {
    diceResults.clear();
    sumResults.clear();
    for (int i = 0; i < (dicesResults.length); i++) {
        dicesResults[i].clear();
    }
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    db.delete(me.herbix.dice.Statistics.TABLE, ((((me.herbix.dice.Statistics.ROW_DICE_PROPERTY) + " = '") + (currentProperty)) + "'"), null);
    db.close();
}