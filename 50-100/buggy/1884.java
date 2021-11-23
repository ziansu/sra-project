private java.lang.Integer getPosition(int accountID, android.database.Cursor cursor) {
    int i;
    java.lang.Integer position = null;
    cursor.moveToFirst();
    for (i = 0; i < ((cursor.getCount()) - 1); i++) {
        int mID = cursor.getInt(0);
        if (mID == accountID) {
            position = i;
            break;
        }
        cursor.moveToNext();
    }
    return position;
}