public void updateBooksData(android.content.Context context) {
    if ((books) != null) {
        for (moe.feng.nhentai.model.Book book : books) {
            book.updateDataFromOldData(context);
        }
    }
}