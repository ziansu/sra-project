public void deleteFavorite(int favoriteID) {
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    db.delete(com.madgusto.gamingreminder.db.DatabaseHelper.TABLE_WEBSITES, (((com.madgusto.gamingreminder.db.DatabaseHelper.COL_FAVORITE_ID) + " = ") + favoriteID), null);
    db.delete(com.madgusto.gamingreminder.db.DatabaseHelper.TABLE_RELEASE_DATES, (((com.madgusto.gamingreminder.db.DatabaseHelper.COL_FAVORITE_ID) + " = ") + favoriteID), null);
    db.delete(com.madgusto.gamingreminder.db.DatabaseHelper.TABLE_FAVORITES, (((com.madgusto.gamingreminder.db.DatabaseHelper.COL_ID) + " = ") + favoriteID), null);
}