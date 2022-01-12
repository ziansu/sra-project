public void insertPerson(org.rhok.linguist.code.entity.Person person) {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    android.content.ContentValues values = getDbValues(person);
    long personId = db.insert(org.rhok.linguist.code.DatabaseHelper.PERSON_TABLE_NAME, null, values);
    person.personid = ((int) (personId));
    person.uploaded = false;
    db.close();
}