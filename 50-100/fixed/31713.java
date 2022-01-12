public java.util.Collection<bean.BookBean> getBooksFromCategory(java.lang.String category) {
    java.util.Collection<bean.BookBean> listOfBooks = null;
    try {
        listOfBooks = bookDao.getBooks("", java.lang.Integer.MAX_VALUE, 0, (category == null ? "" : category)).values();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return listOfBooks;
}