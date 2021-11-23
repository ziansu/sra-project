private int getItemViewTypeHelper(android.database.Cursor cursor) {
    boolean is_from_user = (cursor.getInt(cursor.getColumnIndexOrThrow("is_from_user"))) > 0;
    if (is_from_user == true) {
        return 0;
    }else {
        return 1;
    }
}