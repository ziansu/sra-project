@java.lang.Override
public boolean deleteNews(java.lang.Integer id) {
    session = getCurrentSession();
    com.epam.chadov.task1.database.Transaction transaction = session.beginTransaction();
    try {
        com.epam.chadov.task1.model.News news = getById(id);
        session.delete(news);
        transaction.commit();
    } catch (com.epam.chadov.task1.database.HibernateException e) {
        com.epam.chadov.task1.database.NewsHibernateDao.logger.error("Can't save or update object in DB", e);
        transaction.rollback();
        return false;
    }
    return true;
}