@java.lang.Override
public void save(com.github.kamys.managerProduct.logic.layout.Layout layout) {
    com.github.kamys.managerProduct.data.managers.ManagerLayout.LOGGER.info(("save: " + layout));
    org.hibernate.Transaction tr = null;
    try (org.hibernate.Session session = factory.openSession()) {
        tr = session.beginTransaction();
        session.save(layout);
        tr.commit();
    } catch (org.hibernate.HibernateException e) {
        if (tr != null)
            tr.rollback();
        
        com.github.kamys.managerProduct.data.managers.ManagerLayout.LOGGER.warn(e);
    }
}