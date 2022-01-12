public static org.zkoss.zss.model.SBook createOrGetBook(java.lang.String bookName) {
    org.zkoss.zss.model.SBook book = org.zkoss.zss.model.sys.BookBindings.get(bookName);
    if (book == null) {
        book = new org.zkoss.zss.model.impl.BookImpl(bookName);
        book.createSheet("Sheet1");
        book.createSheet("Sheet2");
        ((org.zkoss.zss.model.impl.AbstractBookAdv) (book)).initDefaultCellStyles();
        org.zkoss.zss.model.sys.BookBindings.put(book.getBookName(), book);
    }
    return book;
}