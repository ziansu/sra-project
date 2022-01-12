private boolean usernameExists(java.lang.String username) {
    android.database.Cursor cursor = dbUtils.readUserRecord();
    if (cursor.moveToFirst()) {
        do {
            java.lang.String nodeUsername = cursor.getString(cursor.getColumnIndex(DBHelper.KEY_USERNAME));
            if (nodeUsername.equals(username)) {
                return true;
            }
        } while (cursor.moveToNext() );
    }
    return false;
}