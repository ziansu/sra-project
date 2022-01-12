private static void delZeroCountTag() {
    java.lang.String sql = "DELETE FROM tag WHERE count<=0";
    animalize.github.com.quantangshi.Database.MyDatabaseHelper.mDb.execSQL(sql);
}