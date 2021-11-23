public void removeBook(int position) {
    com.josephcmontgomery.bookscanner.Tools.BookInformation book = getBookFromDataSource(position);
    if ((book.bookId) != (-1)) {
        com.josephcmontgomery.bookscanner.Database.Database.deleteBookById(book.bookId, context);
        cursor = com.josephcmontgomery.bookscanner.Database.Database.getAllBooks(context);
        notifyDataSetChanged();
    }else {
        books.remove(position);
        notifyDataSetChanged();
    }
    com.josephcmontgomery.bookscanner.Tools.BookCache.removeBook(book);
}