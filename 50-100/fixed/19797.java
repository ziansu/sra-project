public java.lang.String insert(com.wipro.ats.bdre.md.dao.jpa.LineageQuery lineageQuery) {
    org.hibernate.Session session = sessionFactory.openSession();
    java.lang.String id = null;
    try {
        session.beginTransaction();
        id = ((java.lang.String) (session.save(lineageQuery)));
        session.getTransaction().commit();
    } catch (com.wipro.ats.bdre.exception.MetadataException e) {
        session.getTransaction().rollback();
        com.wipro.ats.bdre.md.dao.LineageQueryDAO.LOGGER.error(e);
    } finally {
        session.close();
    }
    return id;
}