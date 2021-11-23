public boolean remove(E object) {
    boolean result = true;
    try {
        entityManager.getTransaction().begin();
        entityManager.remove(object);
        entityManager.getTransaction().commit();
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
        entityManager.getTransaction().rollback();
        result = false;
    }
    return result;
}