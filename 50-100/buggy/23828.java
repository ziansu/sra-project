public com.ss.academy.java.model.user.User getCurrentBookLoaner(java.lang.Long book_id) {
    com.ss.academy.java.model.user.User currentBookLoaner = null;
    java.util.List<com.ss.academy.java.model.book.BookHistory> booksHistory = dao.findAllBooksHistory();
    for (com.ss.academy.java.model.book.BookHistory bookHistory : booksHistory) {
        if (((bookHistory.getBook().getId()) == book_id) && ((bookHistory.getIsReturned()) == (LOANED_BOOK))) {
            currentBookLoaner = bookHistory.getUser();
            break;
        }
    }
    return currentBookLoaner;
}