@java.lang.Override
public net.javaonline.spring.product.model.IndividualDescription getById(int id) {
    org.hibernate.Session session = sessionFactory.getCurrentSession();
    net.javaonline.spring.product.model.IndividualDescription individualDescription = null;
    try {
        session.beginTransaction();
        individualDescription = ((net.javaonline.spring.product.model.IndividualDescription) (session.get(net.javaonline.spring.product.model.IndividualDescription.class, id)));
    } catch (org.hibernate.HibernateException e) {
        e.printStackTrace();
        session.getTransaction().rollback();
    }
    session.getTransaction().commit();
    return individualDescription;
}