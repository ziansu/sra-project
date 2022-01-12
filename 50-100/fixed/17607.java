public static long genericDelete(java.lang.Class type, java.util.Map<java.lang.String, java.lang.Object> conditions) {
    com.baremind.utils.EntityManager em = com.baremind.utils.JPAEntry.getNewEntityManager();
    em.getTransaction().begin();
    java.util.List os = com.baremind.utils.JPAEntry.getList(em, type, conditions, null);
    long result = os.size();
    for (java.lang.Object o : os) {
        em.remove(o);
    }
    em.getTransaction().commit();
    em.close();
    return result;
}