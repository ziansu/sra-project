public java.lang.String saveBookTb(com.youshibi.app.data.bean.Book book) {
    com.youshibi.app.data.db.table.BookTb bookTb = loadBookTbById(book.getId());
    if (bookTb == null) {
        bookTb = com.youshibi.app.util.DataConvertUtil.book2BookTb(book, null);
        mDaoSession.getBookTbDao().insert(bookTb);
    }else {
        bookTb = com.youshibi.app.util.DataConvertUtil.book2BookTb(book, bookTb);
        mDaoSession.getBookTbDao().update(bookTb);
    }
    com.youshibi.app.rx.RxBus.getDefault().post(new com.youshibi.app.event.AddBook2BookcaseEvent(bookTb));
    return book.getId();
}