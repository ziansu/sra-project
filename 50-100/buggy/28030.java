public void init() {
    db = android.database.sqlite.SQLiteDatabase.openOrCreateDatabase("/data/data/com.example.newsapp/newss.db", null);
    delete();
    try {
        db.execSQL("create table news(id text primary key, tag text, sim_json text, com_json text, star text, read text)");
    } catch (java.lang.Exception e) {
    }
    try {
        db.execSQL("create table tags(id text primary key)");
    } catch (java.lang.Exception e) {
    }
    try {
        db.execSQL("create table blacklist(word text primary key)");
    } catch (java.lang.Exception e) {
    }
}