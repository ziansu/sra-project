public boolean add(java.lang.String source, java.lang.String name) {
    android.content.ContentValues values = new android.content.ContentValues();
    values.put("source", source);
    values.put("name", name);
    values.put("called", 0);
    values.put("inarow", 0);
    return (database.insert(TablePictures.NAME, null, values)) == (-1);
}