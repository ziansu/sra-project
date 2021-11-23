public boolean insertFoodEaten(comjschmulandandroidgroupproject.httpsgithub.androidgroupproject.models.FoodEaten foodEaten) {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(comjschmulandandroidgroupproject.httpsgithub.androidgroupproject.AppDBHelper.FOOD_ITEM, foodEaten.getFoodName());
    values.put(comjschmulandandroidgroupproject.httpsgithub.androidgroupproject.AppDBHelper.CALORIES, foodEaten.getCalories());
    values.put(comjschmulandandroidgroupproject.httpsgithub.androidgroupproject.AppDBHelper.DATE, foodEaten.getDate().toString());
    if ((db.insert(comjschmulandandroidgroupproject.httpsgithub.androidgroupproject.AppDBHelper.FOOD_EATEN_TABLE, null, values)) >= 0) {
        return true;
    }
    return false;
}