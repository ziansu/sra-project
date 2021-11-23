@java.lang.Override
public void remove(int id) {
    org.hibernate.Session session = sessionFactory.getCurrentSession();
    session.beginTransaction();
    net.javaonline.spring.product.model.IndividualDescription item = ((net.javaonline.spring.product.model.IndividualDescription) (session.get(net.javaonline.spring.product.model.IndividualDescription.class, id)));
    if (null != item) {
        session.delete(item);
    }
    session.getTransaction().commit();
}