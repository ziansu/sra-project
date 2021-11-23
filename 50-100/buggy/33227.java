private void writeBackBook(java.lang.String ean, java.lang.String title, java.lang.String subtitle, java.lang.String desc, java.lang.String imgUrl) {
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(AlexandriaContract.BookEntry._ID, ean);
    values.put(AlexandriaContract.BookEntry.TITLE, title);
    values.put(AlexandriaContract.BookEntry.IMAGE_URL, imgUrl);
    values.put(AlexandriaContract.BookEntry.SUBTITLE, subtitle);
    values.put(AlexandriaContract.BookEntry.DESC, desc);
    getContentResolver().insert(AlexandriaContract.BookEntry.CONTENT_URI, values);
}