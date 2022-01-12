@org.springframework.transaction.annotation.Transactional
public edu.harvard.lib.librarycloud.collections.dao.Role getOrCreateRole(java.lang.String name) {
    edu.harvard.lib.librarycloud.collections.dao.Role result;
    java.lang.String query = "SELECT r FROM Role r " + "WHERE r.name = :name";
    try {
        result = em.createQuery(query, edu.harvard.lib.librarycloud.collections.dao.Role.class).setParameter("name", name).setMaxResults(1).getSingleResult();
    } catch (edu.harvard.lib.librarycloud.collections.dao.NoResultException e) {
        result = new edu.harvard.lib.librarycloud.collections.dao.Role(name);
        em.persist(result);
        em.flush();
    }
    return result;
}