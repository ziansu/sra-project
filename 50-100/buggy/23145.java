private void writeBackAuthors(java.lang.String ean, org.json.JSONArray jsonArray) throws org.json.JSONException {
    android.content.ContentValues values = new android.content.ContentValues();
    for (int i = 0; i < (jsonArray.length()); i++) {
        values.put(AlexandriaContract.AuthorEntry._ID, ean);
        values.put(AlexandriaContract.AuthorEntry.AUTHOR, jsonArray.getString(i));
        getContentResolver().insert(AlexandriaContract.AuthorEntry.CONTENT_URI, values);
        values = new android.content.ContentValues();
    }
}