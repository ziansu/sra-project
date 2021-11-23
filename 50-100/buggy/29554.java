@java.lang.Deprecated
public static java.util.ArrayList<java.lang.String> jsonBookArrayToBookIdArrayList(com.google.gson.JsonArray jArray) {
    java.util.ArrayList<java.lang.String> bookIds = new java.util.ArrayList<java.lang.String>();
    for (int i = 0; i < (jArray.size()); i++) {
        com.crowdshelf.app.models.Book book = new com.google.gson.Gson().fromJson(jArray.get(i), com.crowdshelf.app.models.Book.class);
        com.crowdshelf.app.MainController.retrieveBook(book);
        bookIds.add(book.get_id());
    }
    return bookIds;
}