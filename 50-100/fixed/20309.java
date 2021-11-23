public static <T> java.util.List<T> loadAll(final worm.abstractation.Connection con, final java.lang.Class<T> c, worm.abstractation.SQLResult result) throws java.sql.SQLException {
    java.util.ArrayList<T> items = new java.util.ArrayList<>();
    if (result.moveToFirst()) {
        while (result.moveToNext()) {
            items.add(worm.abstractation.TableLoader.load(con, c, result));
        } 
    }
    return items;
}