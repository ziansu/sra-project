public static android.content.ContentValues parse(long userId, long pubId) {
    android.content.ContentValues contentValues = new android.content.ContentValues();
    contentValues.put(com.gemapps.picapp.data.PicappContract.BookmarkEntry.COLUMN_PUBLICATION_ID, pubId);
    contentValues.put(com.gemapps.picapp.data.PicappContract.BookmarkEntry.COLUMN_USER_ID, userId);
    return contentValues;
}