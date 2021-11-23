@java.lang.Override
public void update(ua.org.oa.podkopayv.zmarket3.model.Product product) {
    org.hibernate.Session session = sessionFactory.getCurrentSession();
    session.beginTransaction();
    session.update(product);
    session.getTransaction().commit();
}