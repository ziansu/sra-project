public static java.lang.String getEndDate() {
    it.sasabz.android.sasabus.classes.MySQLiteDBAdapter sqlite = it.sasabz.android.sasabus.classes.MySQLiteDBAdapter.getInstance(it.sasabz.android.sasabus.SASAbus.getContext());
    android.database.Cursor c = sqlite.rawQuery("select a_data from validita", null);
    java.lang.String date = null;
    if (c.moveToFirst())
        date = c.getString(c.getColumnIndex("a_data"));
    
    c.close();
    sqlite.close();
    return date;
}