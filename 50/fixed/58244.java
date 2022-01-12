public java.lang.Long saveOrUpdate(org.my.adventure.dao_manager.api.entities.Common object) {
    org.hibernate.Session session = sessionFactory.openSession();
    session.saveOrUpdate(object);
    session.flush();
    session.close();
    return object.getId();
}