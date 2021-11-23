public static void getChartCount(java.lang.String x) {
    android.database.Cursor myCursor;
    try {
        com.totirrapp.cc.databaseReader.db.open(x);
        myCursor = com.totirrapp.cc.databaseReader.db.chartCount();
        DBV.chartCount = myCursor.getCount();
        com.totirrapp.cc.databaseReader.db.close();
        android.util.Log.e("#-- DBR Chart Count--# ", ((DBV.chartCount) + " charts found"));
    } catch (android.database.SQLException e) {
        android.util.Log.e("DBReadAll error", "failed to count database");
        throw e;
    }
}