@java.lang.Override
public boolean addBook(java.lang.String title, java.lang.String author, int price) throws by.tr.library.service.exception.ServiceException {
    boolean result = false;
    by.tr.library.bean.Book book = new by.tr.library.bean.Book();
    book.setAuthor(author);
    book.setTitle(title);
    book.setPrice(price);
    by.tr.library.dao.DAOFactory factory = by.tr.library.dao.DAOFactory.getInstance();
    by.tr.library.dao.AdminDao adminDao = factory.getFileAdminDao();
    try {
        result = adminDao.addNewBook(book);
    } catch (by.tr.library.dao.exception.DAOException e) {
        throw new by.tr.library.service.exception.ServiceException("service message", e);
    }
    return result;
}