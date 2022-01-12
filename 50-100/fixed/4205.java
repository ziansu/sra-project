@java.lang.Override
public void create(br.com.pronatal.model.Problem obj) {
    org.hibernate.Session session = null;
    try {
        session = br.com.pronatal.utils.HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(obj);
        session.getTransaction().commit();
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(("Create exception: " + (e.getMessage())));
    }
}