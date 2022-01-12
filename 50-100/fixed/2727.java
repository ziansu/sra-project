public boolean isThisQueryAProvince(java.lang.String queryText) {
    javax.persistence.TypedQuery<it.polimi.awt.domain.Province> tqp = em.createQuery("SELECT p FROM Province p WHERE name LIKE :name", it.polimi.awt.domain.Province.class);
    java.util.List<it.polimi.awt.domain.Province> list = tqp.setParameter("name", (("%" + queryText) + "%")).getResultList();
    if ((list.size()) > 0)
        return true;
    
    return false;
}