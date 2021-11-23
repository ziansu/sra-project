@java.lang.Override
public void updateBook(kz.zhelezyaka.shelfforbooks.model.Book book) {
    org.hibernate.Session session = this.sessionFactory.getCurrentSession();
    session.update(book);
    kz.zhelezyaka.shelfforbooks.dao.BookDaoImpl.logger.info(("Book successfully update. Book details: " + book));
}