private void deleteIngredientMeasures(long id) {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    db.delete(com.example.caitlin.cookhelper.database.DatabaseHandler.TABLE_INGREDIENT_MEASURES, ((com.example.caitlin.cookhelper.database.DatabaseHandler.KEY_INGREDIENT_MEASURE_RECIPE) + " =?"), new java.lang.String[]{ java.lang.String.valueOf(id) });
}