@java.lang.Override
public void updateItem(com.mycompany.nncloudrestservice.model.User user) {
    org.hibernate.Session session = factory.openSession();
    org.hibernate.Transaction tx = null;
    try {
        tx = session.beginTransaction();
        session.save(user);
        tx.commit();
    } catch (org.hibernate.HibernateException he) {
        if (tx != null)
            tx.rollback();
        
        he.printStackTrace();
    } finally {
        session.close();
    }
}