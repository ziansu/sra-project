@java.lang.Override
protected mobop.booklist.app.data.api.ApiBook doInBackground(java.lang.String... params) {
    try {
        mobop.booklist.app.data.api.ApiBook book = mapper.readValue(params[0], mobop.booklist.app.data.api.ApiBook.class);
        android.util.Log.d("Api", book.toString());
        return book;
    } catch (java.io.IOException e) {
        e.printStackTrace();
        return null;
    }
}