public static void updateDatabase(final android.content.Context context) {
    new java.lang.Thread() {
        public void run() {
            android.database.Cursor c = com.buaa556.projecteuler.MainActivity.db.rawQuery("select id from cache", null);
            int i = (c.getCount()) + 1;
            int count = com.buaa556.projecteuler.MainActivity.dbHelper.generateFrom(i, com.buaa556.projecteuler.MainActivity.db);
            android.widget.Toast.makeText(context, (("成功添加了" + count) + "道题目"), Toast.LENGTH_SHORT).show();
        }
    }.start();
}