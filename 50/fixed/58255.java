private int getItemViewTypeHelper(android.database.Cursor cursor) {
    int is_from_user = cursor.getInt(cursor.getColumnIndexOrThrow("is_from_user"));
    if (is_from_user == 1) {
        return 0;
    }else {
        return 1;
    }
}