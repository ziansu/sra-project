@java.lang.Override
protected java.lang.Boolean doInBackground(java.lang.String... params) {
    try {
        mobop.booklist.app.data.api.ApiBook book = mapper.readValue(params[0], mobop.booklist.app.data.api.ApiBook.class);
        android.util.Log.d("Api", book.toString());
        mListBook.add(book);
        return true;
    } catch (java.io.IOException e) {
        e.printStackTrace();
        return false;
    }
}