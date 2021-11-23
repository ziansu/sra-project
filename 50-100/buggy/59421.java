public boolean persist(E object) {
    boolean result = true;
    try {
        entityManager.getTransaction().begin();
        entityManager.persist(object);
        entityManager.getTransaction().commit();
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
        entityManager.getTransaction().rollback();
        result = false;
    }
    entityManager.close();
    return result;
}