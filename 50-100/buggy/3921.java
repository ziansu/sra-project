@java.lang.Override
public boolean addRoster(core.event.Roster roster) {
    org.hibernate.Session session = core.service.SessionManager.getInstance().openSession();
    org.hibernate.Transaction tx = null;
    try {
        tx = session.beginTransaction();
        session.save(roster);
    } catch (org.hibernate.HibernateException he) {
        if (tx != null) {
            tx.rollback();
        }
        return false;
    } finally {
        session.close();
    }
    return true;
}