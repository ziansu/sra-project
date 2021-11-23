public void reset() {
    for (com.bookstore.booklist.BookListGridListViewAdapter.AdapterItem item : dataList) {
        if (((item.dataCursor) != null) && ((item.dataCursor.isClosed()) == false)) {
            item.dataCursor.close();
        }
    }
    dataList.clear();
    for (int i = 0; i < (bookCategory.getCategoryCount()); i++) {
        dataList.add(new com.bookstore.booklist.BookListGridListViewAdapter.AdapterItem((-1), null));
    }
}