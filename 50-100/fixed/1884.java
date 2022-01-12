private java.lang.Integer getPosition(int accountID, android.database.Cursor cursor) {
    java.lang.Integer position = null;
    if (cursor.moveToFirst()) {
        int i = 0;
        do {
            int mID = cursor.getInt(0);
            if (mID == accountID) {
                position = i;
                break;
            }
            i++;
        } while (cursor.moveToNext() );
    }
    return position;
}