public static int updateDatabase(final android.content.Context context) {
    android.database.Cursor c = com.buaa556.projecteuler.MainActivity.db.rawQuery("select id from cache", null);
    int i = (c.getCount()) + 1;
    int count = com.buaa556.projecteuler.MainActivity.dbHelper.generateFrom(i, com.buaa556.projecteuler.MainActivity.db);
    return count;
}