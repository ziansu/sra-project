public void flipFav(int position) {
    boolean booleanFav = getFav(position);
    booleanFav = !booleanFav;
    int integerFave = (booleanFav) ? 1 : 0;
    android.content.ContentValues args = new android.content.ContentValues();
    args.put(AllSongsEntry.COLUMN_NAME_FAVORITE, integerFave);
    db = dbHelper.getWritableDatabase();
    db.update(AllSongsEntry.TABLE_NAME, args, ((AllSongsEntry.COLUMN_NAME_TRACKNUMBER) + " = ?"), new java.lang.String[]{ java.lang.String.valueOf((position + 1)) });
    db.close();
}