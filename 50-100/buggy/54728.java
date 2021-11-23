private static android.content.ContentValues getContentValues(com.bignerdranch.android.scrapbookapp.Item item) {
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(ItemTable.Cols.UUID, item.getID().toString());
    values.put(ItemTable.Cols.NOTE, item.getMemoText());
    values.put(ItemTable.Cols.HASHTAG, item.getHashtag());
    values.put(ItemTable.Cols.TYPE, item.getItemType());
    values.put(ItemTable.Cols.DATE, item.getDate().toString());
    return values;
}