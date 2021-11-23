public boolean add(database.Picture pic) {
    android.content.ContentValues values = new android.content.ContentValues();
    values.put("source", pic.getSource());
    values.put("name", pic.getName());
    values.put("called", pic.getCalled());
    values.put("inarow", pic.getInarow());
    return (database.insert(TablePictures.NAME, null, values)) == (-1);
}