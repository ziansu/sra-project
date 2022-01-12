@java.lang.Override
public void remove(int id) {
    org.hibernate.Session session = sessionFactory.getCurrentSession();
    session.beginTransaction();
    net.javaonline.spring.product.model.IndividualDescription individualDescription = ((net.javaonline.spring.product.model.IndividualDescription) (session.get(net.javaonline.spring.product.model.IndividualDescription.class, id)));
    if (null != individualDescription) {
        session.delete(individualDescription);
    }
    session.getTransaction().commit();
}