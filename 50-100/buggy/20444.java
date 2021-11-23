public java.util.List<com.github.shynoo.ooad.entity.book.Book> getUserAllBorrowingBooks(java.lang.String id) {
    if (!(isInited)) {
        isInited = true;
        initData();
    }
    java.util.List<java.lang.String> ls = borrowingDao.getUserAllBorrowedBooks(id);
    if (ls == null) {
        return null;
    }
    java.util.List nls = new java.util.LinkedList();
    for (java.lang.String bookId : ls) {
        nls.add(bookDao.getBookById(bookId));
    }
    return nls;
}