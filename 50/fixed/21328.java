@java.lang.Override
public void onOpen(android.database.sqlite.SQLiteDatabase db) {
    super.onOpen(db);
    db.setForeignKeyConstraintsEnabled(true);
}