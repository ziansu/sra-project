private com.example.gev.geography.model.Continent cursorConvert(android.database.Cursor cursor) {
    com.example.gev.geography.model.Continent continent = new com.example.gev.geography.model.Continent();
    continent.setID(cursor.getInt(1));
    continent.setName(cursor.getString(1));
    continent.setArea(cursor.getString(2));
    return continent;
}