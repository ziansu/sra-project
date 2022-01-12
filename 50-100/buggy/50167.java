private java.util.ArrayList<com.canyapan.dietdiaryapp.models.Event> loadItems(org.joda.time.LocalDate date) {
    java.util.ArrayList<com.canyapan.dietdiaryapp.models.Event> list = null;
    try {
        list = com.canyapan.dietdiaryapp.db.EventHelper.getEventByDate(getContext(), date);
    } catch (android.database.sqlite.SQLiteException e) {
        android.util.Log.e(com.canyapan.dietdiaryapp.fragments.DayFragment.TAG, "Content cannot be prepared probably a DB issue.", e);
    } finally {
        if (null == list) {
            list = new java.util.ArrayList<>(0);
        }
    }
    return list;
}