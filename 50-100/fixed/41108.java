public boolean addFood(org.json.JSONObject foodEntry) {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    android.content.ContentValues values = new android.content.ContentValues();
    values = cleanseValuesAddFood(foodEntry);
    if (((values.get("name")) == "") || (existsInBackend(foodEntry))) {
        return false;
    }
    long e = db.insert("groceries", null, values);
    db.close();
    if (e == (-1)) {
        return false;
    }
    return true;
}