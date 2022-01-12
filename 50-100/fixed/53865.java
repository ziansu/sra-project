public static void main(java.lang.String[] args) {
    Test.factory = javax.persistence.Persistence.createEntityManagerFactory(Test.PERSISTENCE_UNIT_NAME);
    javax.persistence.EntityManager em = Test.factory.createEntityManager();
    em.getTransaction().begin();
    em.getTransaction().commit();
    em.close();
}