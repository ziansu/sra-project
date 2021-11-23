public static boolean deleteBook(java.lang.String bookID) {
    bean.Book dropBook = new bean.Book();
    dropBook.setBookID(bookID);
    database.Database.deleteBook(dropBook);
}