@java.lang.Override
public core.service.Authorization login(java.lang.String userId) {
    org.hibernate.Transaction tx = null;
    core.service.User user = new core.service.User();
    try (org.hibernate.Session session = core.service.SessionManager.getInstance().openSession()) {
        tx = session.beginTransaction();
        user = session.get(core.service.User.class, userId);
        tx.commit();
    } catch (org.hibernate.HibernateException he) {
        if (tx != null) {
            tx.rollback();
        }
    }
    return user.getAuthorization();
}