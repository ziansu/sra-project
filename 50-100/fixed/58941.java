public boolean saveData(Entity.Contact contact) {
    session = setSession();
    try {
        session.beginTransaction();
        session.persist(contact);
        session.save(contact);
        session.getTransaction().commit();
    } catch (org.hibernate.HibernateException he) {
        he.printStackTrace();
        if ((session.getTransaction()) != null) {
            return false;
        }
    } finally {
        session.close();
    }
    return true;
}