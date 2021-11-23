@java.lang.Override
public void updateBook(kz.zhelezyaka.shelfforbooks.model.Book book) {
    sessionFactory.getCurrentSession().update(book);
    kz.zhelezyaka.shelfforbooks.dao.BookDaoImpl.logger.info(("Book successfully update. Book details: " + book));
}