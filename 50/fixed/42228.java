@java.lang.Override
public edu.itis.webapp.dao.entities.Order get(java.lang.Long id) {
    org.hibernate.Session session = sessionFactory.getCurrentSession();
    edu.itis.webapp.dao.entities.Order selectedOrder = session.get(edu.itis.webapp.dao.entities.Order.class, id);
    return selectedOrder;
}