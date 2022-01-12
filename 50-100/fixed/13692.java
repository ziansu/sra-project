@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    android.util.Log.w(com.abheri.san.data.DataHelper.class.getName(), (((("Upgrading database from version " + oldVersion) + " to ") + newVersion) + ", which will destroy all old data"));
    DeleteTopicTable(db);
    DeleteSentenceTable(db);
    DeleteWordTable(db);
    DeleteCacheTable(db);
    onCreate(db);
}