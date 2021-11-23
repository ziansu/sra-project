@java.lang.Override
public com.health.entity.GP findById(int gid) {
    try {
        java.lang.String str = "SELECT g FROM GP g WHERE g.gp_id = ?1";
        javax.persistence.Query query = em.createQuery(str);
        query.setParameter(1, gid);
        return ((com.health.entity.GP) (query.getSingleResult()));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        em.close();
        return null;
    }
}