public void changeCursor(android.database.Cursor c) {
    if ((cursor) != null)
        cursor.close();
    
    cursor = c;
    notifyDataSetChanged();
}