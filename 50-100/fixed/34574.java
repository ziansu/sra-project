public void create(T object) {
    javax.persistence.EntityManager entityManager = null;
    try {
        java.lang.System.out.println(object.toString());
        entityManager = com.softserve.tc.diaryclient.dao.impl.JPAUtil.getFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(object);
        entityManager.getTransaction().commit();
    } finally {
        if ((entityManager != null) && (entityManager.isOpen())) {
            entityManager.close();
        }
    }
}