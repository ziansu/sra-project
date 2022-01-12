@java.lang.Override
public boolean addBook(by.tr.library.bean.Book book) throws by.tr.library.service.exception.ServiceException {
    boolean result = false;
    by.tr.library.dao.DAOFactory factory = by.tr.library.dao.DAOFactory.getInstance();
    by.tr.library.dao.AdminDao adminDao = factory.getFileAdminDao();
    try {
        result = adminDao.addNewBook(book);
    } catch (by.tr.library.dao.exception.DAOException e) {
        throw new by.tr.library.service.exception.ServiceException("service message", e);
    }
    return result;
}