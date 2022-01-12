@java.lang.SuppressWarnings(value = "unused")
private void testQuery(java.lang.String qs) {
    org.hibernate.Session session = com.saintsoftware.tools.HibernateUtil.getSessionFactory().openSession();
    java.util.List<java.lang.Object[]> results = session.createQuery(qs).list();
    java.util.List<com.saintsoftware.model.Book> books = com.saintsoftware.tools.DataUtils.convertToBookList(results);
    if (books != null) {
        for (com.saintsoftware.model.Book book : books) {
            com.saintsoftware.tools.DataUtils.logger.debug(book.toString());
        }
        com.saintsoftware.tools.DataUtils.logger.debug(((results.size()) + " books returned."));
    }
}