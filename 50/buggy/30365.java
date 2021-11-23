public void updateTable() {
    mCursor = sqLiteDatabase.rawQuery((("SELECT * FROM " + (MyDatabase.TABLE_NAME_PICTURE)) + " ORDER BY _id DESC"), null);
    mCursor.moveToFirst();
    notifyDataSetChanged();
}