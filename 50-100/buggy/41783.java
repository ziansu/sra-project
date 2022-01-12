public static java.util.List<java.util.Date> getDistinctDates() {
    com.umb.cs682.projectlupus.db.helpers.DaoSession session = com.umb.cs682.projectlupus.config.LupusMate.getDaoSession();
    java.util.ArrayList<java.util.Date> result = new java.util.ArrayList<>();
    android.database.Cursor c = session.getDatabase().rawQuery(com.umb.cs682.projectlupus.service.MoodLevelService.SQL_DISTINCT_DATES, null);
    if (c.moveToFirst()) {
        do {
            result.add(com.umb.cs682.projectlupus.util.DateTimeUtil.toDate(c.getString(0)));
        } while (c.moveToNext() );
    }
    c.close();
    return result;
}