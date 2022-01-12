private com.sonnytron.sortatech.pantryprep.Database.IngredientsCursorWrapper queryTopFiveIngredients(java.lang.String whereClause, java.lang.String[] whereArgs) {
    android.database.sqlite.SQLiteQueryBuilder qb = new android.database.sqlite.SQLiteQueryBuilder();
    java.lang.String[] subQueries = new java.lang.String[]{ "SELECT * FROM (SELECT * FROM ingredientsItems where type = 'protein' order by date desc limit 1) as meat" , "SELECT * FROM (SELECT * FROM ingredientsItems where type in ('dairy', 'veggies') order by date desc limit 4) as others" };
    java.lang.String sql = qb.buildUnionQuery(subQueries, null, null);
    android.util.Log.d("query sql: ", sql);
    android.database.Cursor cursor = mDatabase.rawQuery(sql, null);
    return new com.sonnytron.sortatech.pantryprep.Database.IngredientsCursorWrapper(cursor);
}