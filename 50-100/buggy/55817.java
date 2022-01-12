public static int DeleteCharacter(Services.DAL.Character character) {
    int rows = 0;
    Services.Session session = DAL.HibernateUtil.getSessionFactory().openSession();
    Services.Transaction tx = null;
    try {
        tx = session.beginTransaction();
        session.delete(tx);
        tx.commit();
    } catch (java.lang.Exception e) {
        if (tx != null)
            tx.rollback();
        
        java.lang.System.err.println(e.getMessage());
    } finally {
        session.close();
    }
    return rows;
}