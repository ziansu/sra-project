private boolean keyExists(java.lang.String newkey) {
    em.createQuery("SELECT a FROM ApiKey a WHERE a.key= :newkey").setParameter("newkey", newkey).getResultList();
    return false;
}