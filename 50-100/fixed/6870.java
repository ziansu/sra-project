public void insert(com.bergamin.contactlist.model.Contact contact) {
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    android.content.ContentValues data = new android.content.ContentValues();
    data.put("name", contact.getName());
    data.put("address", contact.getAddress());
    data.put("phone", contact.getPhone());
    data.put("webSite", contact.getWebSite());
    db.insert("Contacts", null, data);
}