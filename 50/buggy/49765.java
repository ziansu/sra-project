@java.lang.Override
public void add(edu.itis.webapp.dao.entities.Order order) {
    org.hibernate.Session session = sessionFactory.getCurrentSession();
    session.beginTransaction();
    session.save(order);
    session.getTransaction().commit();
}