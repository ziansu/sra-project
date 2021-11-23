@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    db.beginTransaction();
    com.czbix.v2ex.dao.NodeDAO.createTable(db);
    db.endTransaction();
}