public static boolean deleteBook(int bookID) {
    bean.Book dropBook = new bean.Book();
    dropBook.setBookID(bookID);
    return database.Database.deleteBook(dropBook);
}