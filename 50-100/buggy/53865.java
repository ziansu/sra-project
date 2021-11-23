public static void main(java.lang.String[] args) {
    Test.factory = javax.persistence.Persistence.createEntityManagerFactory(Test.PERSISTENCE_UNIT_NAME);
    javax.persistence.EntityManager em = Test.factory.createEntityManager();
    Person.Person p = new Person.Person(11, "Cao", "Zhi");
    em.getTransaction().begin();
    em.persist(p);
    em.getTransaction().commit();
    em.close();
}