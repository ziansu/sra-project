private void checkInspectionTime() {
    nyc.c4q.jonathancolon.inContaq.utlities.sqlite.ContactDatabaseHelper dbHelper = nyc.c4q.jonathancolon.inContaq.utlities.sqlite.ContactDatabaseHelper.getInstance(getApplicationContext());
    db = dbHelper.getWritableDatabase();
    java.util.List<nyc.c4q.jonathancolon.inContaq.contactlist.model.Contact> contacts = nyc.c4q.jonathancolon.inContaq.utlities.sqlite.SqlHelper.selectAllContacts(db);
    for (int i = 0; i < 1; i++) {
        nyc.c4q.jonathancolon.inContaq.contactlist.model.Contact contact = contacts.get(i);
        startNotification(contact);
    }
}